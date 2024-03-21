package com.satya.cons.ambi.constructorambi;

public class Employee {
	
	private int empId;
	private String name;
	private Address address;
	public Employee(int empId, String name, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}
	

}
