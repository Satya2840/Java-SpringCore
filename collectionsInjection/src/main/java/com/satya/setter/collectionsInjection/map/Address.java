package com.satya.setter.collectionsInjection.map;

import java.util.Map;

public class Address {
	
	private String hNo;
	private String street;
	private String city;
	private Map<Integer,String> pinCode;
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Map<Integer, String> getPinCode() {
		return pinCode;
	}
	public void setPinCode(Map<Integer, String> pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
	

}
