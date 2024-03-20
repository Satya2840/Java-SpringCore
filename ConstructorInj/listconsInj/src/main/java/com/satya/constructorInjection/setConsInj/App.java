package com.satya.constructorInjection.setConsInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/constructorInjection/setConsInj/context.xml");
		Departments dept = (Departments) context.getBean("dept");
		dept.display();
	}

}
