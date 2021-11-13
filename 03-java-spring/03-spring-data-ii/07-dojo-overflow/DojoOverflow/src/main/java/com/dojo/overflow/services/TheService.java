package com.dojo.overflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.overflow.models.Answer;
import com.dojo.overflow.models.Question;
import com.dojo.overflow.models.Tag;
import com.dojo.overflow.repositories.AnswerRepository;
import com.dojo.overflow.repositories.QuestionRepository;
import com.dojo.overflow.repositories.TagRepository;

@Service
public class TheService {
	
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private TagRepository tRepo;
	
	public Tag getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if (this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQ.add(tagToAdd);
			} else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQ.add(this.getOneTag(s));
			}
		}
		return tagsForQ;
	
	}
	public Question createQuestion (Question question) {
		question.setQtags(this.splitTags(question.getTagsFromFrontEnd()));
		return this.qRepo.save(question);
	}
	
	public Answer createAnswer (Answer answer) {
		return  this.aRepo.save(answer);
	}
	
	public List<Question> getAllQuestions(){
		return this.qRepo.findAll()
;	}
	public Question findOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
}
