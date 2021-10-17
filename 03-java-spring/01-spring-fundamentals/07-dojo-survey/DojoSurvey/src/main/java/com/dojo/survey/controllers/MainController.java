package com.dojo.survey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, 
			@RequestParam("location") String loc, 
			@RequestParam("language") String lang, 
			@RequestParam("comment") String com, Model model, HttpSession session) {
		model.addAttribute("n", name);
		model.addAttribute("l", loc);
		model.addAttribute("lan", lang);
		model.addAttribute("c", com);
		session.setAttribute("user", name);
		return "result.jsp";
	}
	
	@GetMapping("/result/info")
	public String info() {
		return "info.jsp";
	}
}
