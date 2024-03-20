package com.satya.constructorInjection.setConsInj;

import java.util.Set;

public class Departments {
	
	private int deptid;
	private Set<String> deptNames;
	public Departments(int deptid, Set<String> deptNames) {
		super();
		this.deptid = deptid;
		this.deptNames = deptNames;
	}
	public void display() {
		System.out.println(deptid);
		System.out.println(deptNames);
	}
}
