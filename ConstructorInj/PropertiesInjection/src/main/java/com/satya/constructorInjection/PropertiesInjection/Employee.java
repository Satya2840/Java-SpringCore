package com.satya.constructorInjection.PropertiesInjection;

import java.util.List;

public class Employee {
	private int empid;
	private List<String> name;
	
	
	public Employee(int empid, List<String> name) {
		super();
		this.empid = empid;
		this.name = name;
	}


	public void display() {
		System.out.println(empid);
		for(String str:name) {
			System.out.println(str);
		}
	}
	
	

}
