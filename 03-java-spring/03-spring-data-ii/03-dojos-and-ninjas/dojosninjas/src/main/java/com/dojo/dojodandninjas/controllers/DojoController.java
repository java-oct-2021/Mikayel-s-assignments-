package com.dojo.dojodandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.dojodandninjas.models.Dojo;
import com.dojo.dojodandninjas.services.DojoService;
import com.dojo.dojodandninjas.services.NinjaService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("newDojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/newdojo")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo) {
		this.dService.create(dojo);
		return "redirect:/newNinja";
	}
	
	@GetMapping("/dojo/{id}")
	public String info(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneD", this.dService.getOne(id));
		model.addAttribute("allN", this.nService.getAll());
		return "info.jsp";
	}
}
