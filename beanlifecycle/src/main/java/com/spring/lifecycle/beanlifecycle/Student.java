package com.spring.lifecycle.beanlifecycle;

public class Student {
	
	public void init() {
		System.out.println("inside the init");
	}
	public void getStudentDetails() {
		System.out.println("Student no:1");
		System.out.println("Name is : Venkat");
	}
	
	public void destroy() {
		System.out.println("insid the destroy");
	}

}
