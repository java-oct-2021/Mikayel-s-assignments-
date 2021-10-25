package com.dojo.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.languages.models.Languages;
import com.dojo.languages.services.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService lService;

	public HomeController(LanguageService lService) {
		this.lService = lService;
	}
	
	@GetMapping("/languages")
	public String Home(Model model, 
			@ModelAttribute("llcoolj") Languages language) {
		model.addAttribute("allLangs", this.lService.getAll());
		return "home.jsp";
	}
	
	@PostMapping("/languages")
	public String homePost(@Valid @ModelAttribute("llcoolj") Languages language, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allLangs", this.lService.getAll());
		return "home.jsp";
		}
		this.lService.createLang(language);
		return "redirect:/languages";
		
	}
	@GetMapping("/languages/{id}")
	public String info(Model model, @PathVariable("id") Long id) {
		model.addAttribute("oneLang", this.lService.findLang(id));
		return "info.jsp";
	}
//	@GetMapping("/languages/{id}/edit")
//	public String editLang(@PathVariable("id") Long id, Model model) {
//		model.addAttribute("updtLang", this.lService.updateLang(id));
//		return "edit.jsp";
//	}
//	
//	@GetMapping("/language/edit/{id}")
//	public String editLang(Model model, @PathVariable("id") Long id) {
//		model.addAttribute("language", this.lService.findLang(id));
//		return "edit.jsp";
//	}
	
}
