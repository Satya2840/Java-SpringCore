package com.satya.setter.collectionsInjection.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/setter/collectionsInjection/reference/refbeans.xml");

		Employee emp= (Employee) context.getBean("emp");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getHno());
		System.out.println(emp.getAddress().getStreet());
		System.out.println(emp.getAddress().getCity());
	}

}
