package com.spring.core.annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FullStack implements Course {
	
	@Override
	public void course() {
		System.out.println("entrolled for FullStack");
	}
}
