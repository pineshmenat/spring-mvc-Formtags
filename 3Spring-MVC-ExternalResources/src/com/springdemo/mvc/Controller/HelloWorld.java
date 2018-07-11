package com.springdemo.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	//need a controller to showForm
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller to processForm
	@RequestMapping("/processFormVersionTwo")
	public String processForm(HttpServletRequest request, Model model) {	
		String studentName = request.getParameter("studentName");
		String theName = "YO! " + studentName.toUpperCase();
		model.addAttribute("studentName", theName);
		return "helloworld-confirmation";
	}
	
}
