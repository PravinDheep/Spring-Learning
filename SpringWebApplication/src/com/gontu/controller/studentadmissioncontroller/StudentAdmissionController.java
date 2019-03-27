package com.gontu.controller.studentadmissioncontroller;

import java.text.SimpleDateFormat;
//import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	
	@RequestMapping(value="/AdmissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		
/*		String exceptionOccured = "Arithmetic_Exception";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("Null Pointer Exception");
		}else if(exceptionOccured.equalsIgnoreCase("Arithmetic_Exception")) {
			throw new ArithmeticException("Arithmetic Exception");
		}
*/		
		ModelAndView model = new ModelAndView("AdmissionForm");
		//model.addObject("headerMessage","Engineering College,India");
		return model;
	}
	
	
/*	@RequestMapping(value="/AdmissionSuccess", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="PravinDheep") String name,@RequestParam(value="studentHobby", defaultValue="Football") String hobby) {
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",defaultValue="PravinDheep") String name, @RequestParam Map<String,String> reqPars) {
		String hobby = reqPars.get("studentHobby");
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("message", "Details submitted by you:: Name: " + name + ", Hobby:: " + hobby);
		return model;
	}
*/	
	
	
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
		model1.addAttribute("headerMessage","Engineering College,India");
		
	}
	
	
	
	@RequestMapping(value="/AdmissionSuccess", method=RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",defaultValue="PravinDheep") String name, @RequestParam(value="studentHobby", defaultValue="Football") String hobby) {
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1, BindingResult result) {	
//		Student student1 = new Student();
//		student1.setStudentName(name);
//		student1.setStudentHobby(hobby);
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage","Engineering College,India");
//		model.addObject("student1",student1);
		return model;
	
	}
		
}