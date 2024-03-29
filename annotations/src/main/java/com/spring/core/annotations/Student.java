package com.spring.core.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/spring/core/annotations/studentDetails.properties")
public class Student {
	
	@Value("${no}")
	private int no;
	@Value("${name}")
	private String name;
	
	public void getStudentDetails() {
		System.out.println("Student no : "+no);
		System.out.println("Student name : "+name);
	}
}
