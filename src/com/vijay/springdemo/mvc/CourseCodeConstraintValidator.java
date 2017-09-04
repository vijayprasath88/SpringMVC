package com.vijay.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	public String coursePrefix;
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	
	
	public boolean isValid(String theCode, ConstraintValidatorContext theContext) {
		boolean result;
		
		if(theCode !=null){
			result = theCode.startsWith(coursePrefix);
		} else {
			result = false;
		}
		
		return result;
	}

}
