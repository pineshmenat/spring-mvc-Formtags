package com.springdemo.mvc.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.mvc.Model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{favoriteWebsiteOptions}")
	private Map<String, String>favoriteWebsiteOptions;
	
	@RequestMapping("showForm")
	public String showForm(Model theModel) {
		
		//create a student obj
		Student theStudent  = new Student();
		
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		theModel.addAttribute("favoriteWebsiteOptions", favoriteWebsiteOptions);
		
		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + theStudent.getLastName());
		return "student-confirmation";
	}

}
