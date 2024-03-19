package com.satya.constructorInjection.constructorProperties;

public class Employee {
	
	private int empId;
	private String name;
	public Employee(String name, int empId) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public void display() {
		
		System.out.println(name);
		System.out.println(empId);
	}

}
