package com.dojo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/dashboard")
	public String dashboard(@RequestParam("code") String c, RedirectAttributes redAtt){
		if(c.equals("bushido")) {
			return "dashboard.jsp";
		}
		else {
			redAtt.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
}
