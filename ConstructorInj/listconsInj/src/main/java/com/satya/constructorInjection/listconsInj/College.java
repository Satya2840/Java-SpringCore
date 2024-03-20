package com.satya.constructorInjection.listconsInj;

import java.util.List;

public class College {
	
	private String clgName;
	private List<String> depts;
	
	public College(String clgName, List<String> depts) {
		super();
		this.clgName = clgName;
		this.depts = depts;
	}
	
	public void display() {
		System.out.println(clgName);
		System.out.println(depts);
	}
	
	

}
