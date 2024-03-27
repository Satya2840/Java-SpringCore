package com.satya.example.propsInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Trainer {
	
	@Autowired
	private Students students1;

	public void display() {
		System.out.println(students1.getId());
		System.out.println(students1.getName());
		
	}
}
