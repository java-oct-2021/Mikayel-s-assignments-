package com.dojo.overflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.overflow.models.Answer;
import com.dojo.overflow.models.Question;
import com.dojo.overflow.services.TheService;
import com.dojo.overflow.validators.TagValidator;

@Controller
public class MainController {
	@Autowired
	private TheService tService;
	@Autowired
	private TagValidator validator;
	
	
	@GetMapping ("/")
	public String index(Model model) {
		model.addAttribute("allQ", this.tService.getAllQuestions());
		return "dashboard.jsp";
	}
	@GetMapping ("/new")
	public String newQuest(@ModelAttribute("question") Question question) {
		return "new.jsp";
	}
	@PostMapping("/newQuestion")
	public String addQuest(@Valid @ModelAttribute("question") Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.tService.createQuestion(question);
		return "redirect:/";
	}
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("answer") Answer answer) {
		viewModel.addAttribute("question", this.tService.findOneQuestion(id));
		return "show.jsp";
	}
	@PostMapping("/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
		viewModel.addAttribute("question", this.tService.findOneQuestion(answer.getQuest().getId()));
		return "show.jsp"; 
	}
		this.tService.createAnswer(answer);
		return "redirect/show/" + answer.getQuest().getId();
	}
	
}