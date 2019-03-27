package com.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
	public String sayHello(ModelMap model) {
		model.addAttribute("Greeting","Hello World");
		return "welcome";
	}
}
