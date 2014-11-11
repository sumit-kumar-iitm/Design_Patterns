package com.sppl.training.abstractfactory;

public abstract class Address {
	private int doorNo;
	private String street;
	private String location;
	private String city;
	public Address(int doorNo, String street, String location, String city) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.location = location;
		this.city = city;
	}
	
	public abstract String getCountry();

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street
				+ ", location=" + location + ", city=" + city + " country "+getCountry()+" ]";
	}
	
	
}
