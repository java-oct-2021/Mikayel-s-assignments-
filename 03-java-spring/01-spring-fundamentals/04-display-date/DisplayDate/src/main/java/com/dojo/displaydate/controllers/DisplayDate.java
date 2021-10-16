package com.dojo.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DisplayDate {
	public Date show() {
		Date dt = new Date();
		return dt;
	}
	
	
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";		
	}
	
	@GetMapping("/date")
	public String showDate(Model model) {
		model.addAttribute("showDate", show());
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String showTime(Model model) {
		model.addAttribute("showTime", show());
		return "time.jsp";
	}
	
}
