package com.satya.scopes.beanscopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Trainer trainer;
	
	public Student() {
		System.out.println("Student object created");
	}

	@Lookup
	Trainer createTrainerObject() {
		return null;
		
	}
	public Trainer getTrainer() {
		Trainer trainer = createTrainerObject();
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

}
