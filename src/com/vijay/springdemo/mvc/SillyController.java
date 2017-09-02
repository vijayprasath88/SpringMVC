package com.vijay.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/generalForm")
public class SillyController {
	
	@RequestMapping("/showform")
	public String displayForm() {
		return "name-form";
	}
	
	@RequestMapping("/processform")
	public String usingModel1(@RequestParam("studentName") String name, Model model) {
		//String name = request.getParameter("studentName");
		
		if(name!="") {
			model.addAttribute("message", ("Your username is "+ name));
		}else {
			model.addAttribute("message", "Your name is empty. Please go back and enter your name again");
		}
		return "name-processed";
	}

}
