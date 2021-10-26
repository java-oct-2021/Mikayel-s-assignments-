package com.dojo.languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dojo.languages.models.Language;
import com.dojo.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService langServ;
	public LanguageController(LanguageService service) {
		this.langServ = service;
	}
	
	@GetMapping("/")
	public String index(Model model, @ModelAttribute("language") Language language) {
		model.addAttribute("allLanguages", this.langServ.allLanguages());
		return "index.jsp";
	}
	
	@PostMapping("/")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allLanguages", this.langServ.allLanguages());
			return "index.jsp";
		}
		this.langServ.createLanguage(language);
		return "redirect:/";
	}
	@GetMapping("/detail/{id}")
	public String showLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("thisLang", this.langServ.findLanguage(id));
			return "detail.jsp";
	}
	@GetMapping("/edit/{id}")
	public String editLang(Model model, @PathVariable("id") Long id) {
		model.addAttribute("language", this.langServ.findLanguage(id));
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String editLang(@Valid @ModelAttribute("language") Language lang, BindingResult result, Model model, @PathVariable("id") Long id) {
		if (result.hasErrors()) {
			model.addAttribute("language", this.langServ.findLanguage(id));
			return "edit.jsp";
		}
		this.langServ.updateLanguage(lang);
		return "redirect:/show/{id}";
	}
	@GetMapping("/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		this.langServ.deleteLanguage(id);
		return "redirect:/"; 
	}
	
}
