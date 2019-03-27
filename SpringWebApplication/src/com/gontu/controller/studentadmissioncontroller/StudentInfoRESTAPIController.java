package com.gontu.controller.studentadmissioncontroller;

 import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoRESTAPIController {
	
	//@ResponseBody
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public ArrayList<Student> getStudentList(){
		Student student1 = new Student();
		student1.setStudentName("AnirudhRavichandar");
		
		Student student2 = new Student();
		student1.setStudentName("SanthoshNarayanan");
		
		Student student3 = new Student();
		student1.setStudentName("ARR");
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		return studentList;
	}
	
	//@ResponseBody
	@RequestMapping(value="/students/{name}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String studentName) {
		
		Student student = new Student();
		student.setStudentName(studentName);
		student.setStudentHobby("MusicDirector");	
		return student;
	}

}
