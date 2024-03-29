package com.spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class Trainer {
	
	@Autowired
	private Student student;
	
	@Autowired
	@Qualifier("frameworks")
	private Course course;
	

	public void getStudentInfo() {
		student.getStudentDetails();
	}
	
	public void getCourseDetails() {
		course.course();
	}


	
	

}
