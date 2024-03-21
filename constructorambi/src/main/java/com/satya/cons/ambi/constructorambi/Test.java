package com.satya.cons.ambi.constructorambi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/cons/ambi/constructorambi/context.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);

	}

}
