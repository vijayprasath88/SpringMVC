package com.vijay.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//add InitBinder Annotation to trim input strings
	//remove leading and trailing whitespace
	//resolve issue for our validation - Whitespaces in lastName
	@InitBinder 
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmer);
	}


	@RequestMapping("/getCustomerForm")
	public String getCustomerForm(Model model){
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/showCustomerForm")
	public String showCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult){
		System.out.println("The Binding Result "+theBindingResult);
		if(theBindingResult.hasErrors()){
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}


}
