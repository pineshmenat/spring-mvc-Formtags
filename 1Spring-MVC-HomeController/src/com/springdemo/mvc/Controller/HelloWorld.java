package com.springdemo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	//need a controller to showForm
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller to processForm
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-confirmation";
	}
	
}
