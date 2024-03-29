package com.spring.core.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Frameworks implements Course {

	@Override
	public void course() {
		System.out.println("enrolled for Frameworks");

	}

}
