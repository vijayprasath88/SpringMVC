package com.vijay.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {


	@RequestMapping("/getCustomerForm")
	public String getCustomerForm(Model model){
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/showCustomerForm")
	public String showCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult){
		
		if(theBindingResult.hasErrors()){
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}


}
