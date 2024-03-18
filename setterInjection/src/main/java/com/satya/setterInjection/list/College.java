package com.satya.setterInjection.list;

import java.util.List;

public class College {
	
	private String clgName;
	private List<String> departmentNames;
	
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public List<String> getDepartmentNames() {
		return departmentNames;
	}
	public void setDepartmentNames(List<String> departmentNames) {
		this.departmentNames = departmentNames;
	}
	
	

}
