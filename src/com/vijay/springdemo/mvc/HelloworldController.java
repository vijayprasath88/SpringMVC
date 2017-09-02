package com.vijay.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {

	@RequestMapping("/showform")
	public String showNameForm() {
		return "name-form";
	}
	
	
	
	public String processForm() {
		return "name-processed";
	}
	
	@RequestMapping("/processform")
	public String usingModel(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		
		if(name!="") {
			model.addAttribute("message", ("Your username is "+ name));
		}else {
			model.addAttribute("message", "Your name is empty. Please go back and enter your name again");
		}
		return "name-processed";
	}
	
	
	
	
	
}
