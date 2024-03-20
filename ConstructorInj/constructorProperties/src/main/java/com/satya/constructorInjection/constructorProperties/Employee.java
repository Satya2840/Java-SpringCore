package com.satya.constructorInjection.constructorProperties;

import java.util.List;

public class Employee {
	
	private int empId;
	private int dbPort;
	
	
		public Employee(int empId, int dbPort) {
		super();
		this.empId = empId;
		this.dbPort = dbPort;
	}

		public void display() {
				
		System.out.println(empId);
		System.out.println(dbPort);
		
	}

}
