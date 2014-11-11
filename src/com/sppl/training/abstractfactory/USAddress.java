package com.sppl.training.abstractfactory;

public class USAddress extends Address{

	public USAddress(int doorNo, String street, String location, String city) {
		super(doorNo, street, location, city);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "US";
	}
}
