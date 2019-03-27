package com.gontu.controller.homecontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HomeController{
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	//public ModelAndView helloWorld(@PathVariable("userName") String name, @PathVariable("countryName") String country) {
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars) {
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcome", "Hello " + name + "You are from " + country);
		return model;
	
	}
	
	@RequestMapping("/hi")
	public ModelAndView hi() {
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("welcome", "Hi World");
		return model;
	
	}
	
	
	
	
	
	
	
//	@Override
//	@RequestMapping("/welcome")
//	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView modelandview = new ModelAndView("HelloPage");
//		modelandview.addObject("welcome","Hi User, Welcome to the First Spring MVC Application");
//		return modelandview;
//	}
	
	
}
