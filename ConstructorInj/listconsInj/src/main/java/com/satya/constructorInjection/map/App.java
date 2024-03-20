package com.satya.constructorInjection.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/satya/constructorInjection/map/context.xml");
		 StatesAndLangs langs=(StatesAndLangs) context.getBean("langs");
		 langs.display();
	}
}
