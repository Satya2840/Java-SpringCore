package com.satya.setter.collectionsInjection;

import java.util.Set;

public class College {
	
	private String clgName;
	
	private Set<String> departments;

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public Set<String> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<String> departments) {
		this.departments = departments;
	}
	
	
	

}
