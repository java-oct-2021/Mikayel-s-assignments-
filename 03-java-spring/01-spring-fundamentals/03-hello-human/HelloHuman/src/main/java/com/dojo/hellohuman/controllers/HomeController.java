package com.dojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String hello(@RequestParam(value="h", required=false, defaultValue="Human") String human, Model model) {
		model.addAttribute("hhh", human);
		return "index.jsp";
	}
	

}
