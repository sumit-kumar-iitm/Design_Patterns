package com.sppl.training.prototype;

public class Address implements Cloneable{
	private String location;
	private String city;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Address(String location, String city) {
		super();
		this.location = location;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [location=" + location + ", city=" + city + "]";
	}
	
}
