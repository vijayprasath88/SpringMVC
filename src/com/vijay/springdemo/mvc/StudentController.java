package com.vijay.springdemo.mvc;


import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/studentForm")
public class StudentController {
	
	@Value("#{countryOptions}")
	private LinkedHashMap<String,String> countryOptions;
	
	@Value("#{favoriteLanguages}")
	private LinkedHashMap<String,String> favoriteLanguages;
	
	@RequestMapping("/getStudentForm")
	public String getstudentForm(Model model){
		model.addAttribute("student", new Student());
		model.addAttribute("theCountryOptions", countryOptions);
		model.addAttribute("thefavoriteLanguages", favoriteLanguages);
		return "get-student-form";
	}
	
	
	@RequestMapping("/showStudentForm")
	public String showstudentForm(@ModelAttribute("student") Student student){
		System.out.println("The Student First Namer is "+ student.getFirstName()  + "  and Last Name is " + student.getLastName());
		return "show-student-form";
	}

}
