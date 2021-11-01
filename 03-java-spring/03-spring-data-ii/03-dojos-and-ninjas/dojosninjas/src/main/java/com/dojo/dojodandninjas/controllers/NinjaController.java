package com.dojo.dojodandninjas.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.dojodandninjas.models.Ninja;
import com.dojo.dojodandninjas.services.DojoService;
import com.dojo.dojodandninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	@GetMapping("/newNinja")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("allDojos", this.dService.getAll());
		return "newNinja.jsp";
	}
	
	@PostMapping("/newninja/create")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja) {
		this.nService.create(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId();
		
	}
}
