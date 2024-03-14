package com.satya.setterInjection.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/setterInjection/list/context.xml");
		College college = (College) context.getBean("clg");
		System.out.println(college.getClgName());
		System.out.println(college.getDepartmentNames());

	}

}
