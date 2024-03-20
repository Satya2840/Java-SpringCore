package com.satya.constructorInjection.map;

import java.util.Map;

public class StatesAndLangs {
	
	private int no;
	private Map<String, String> langs;
	
	public StatesAndLangs(int no, Map<String, String> langs) {
		super();
		this.no = no;
		this.langs = langs;
	}
	
	public void display() {
		System.out.println(no);
		System.out.println(langs);
	}
	
	
	

}
