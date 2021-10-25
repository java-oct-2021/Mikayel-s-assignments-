package com.dojo.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.languages.models.Languages;
import com.dojo.languages.repositories.LangRepository;

@Service
public class LanguageService {
	@Autowired
	private LangRepository lRepo;

	public LanguageService(LangRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public List<Languages> getAll() {
		return this.lRepo.findAll();

	}
	
	public Languages findLang(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public void deleteLang(Long id) {
		this.lRepo.deleteById(id);
	}
	
	public Languages createLang(Languages newLang) {
		return this.lRepo.save(newLang);
	}
	
	public Languages updLang(Languages updateLang) {
		return this.lRepo.save(updateLang);
	}
}
