package com.spring.lifecycle.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private int id;
	private String name;
	
	public void fetchRecords(){
		
		System.out.println("Fetch the records");
		
	}
	
	public void update(){
		
		System.out.println("update the records");
		
	}
	
	public void delete(){
		
		System.out.println("delete the records");
		
		
	}
	
	public void init() {
		getConnection();
	}
	public void getConnection() {
		System.out.println("establish the connection");
	}
	
	
	public void destroy() {
		closeConnection();
	}
	
	public void closeConnection() {
		System.out.println("close the connection");
	}
}
