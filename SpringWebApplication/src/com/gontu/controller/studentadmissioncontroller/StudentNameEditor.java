package com.gontu.controller.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	// When you will submit the admission form -->
	// Spring MVC will run setAsText function of this class -->
	// Before performing data binding task for studentName property of student object
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
        if (studentName.contains("Mr.")) {
        	studentName = "Male: "+studentName;
            setValue(studentName);
        }else if(studentName.contains("Ms.")) {
        	studentName = "Female: " + studentName;
        	setValue(studentName);
        }
        else {
        	studentName = "Male/Female: " + studentName;
        	setValue(studentName);
        }
    }
	
	
}
