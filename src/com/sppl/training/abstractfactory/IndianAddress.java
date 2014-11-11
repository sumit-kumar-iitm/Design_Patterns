package com.sppl.training.abstractfactory;

public class IndianAddress extends Address{

	public IndianAddress(int doorNo, String street, String location, String city) {
		super(doorNo, street, location, city);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return "India";
	}
	
}
