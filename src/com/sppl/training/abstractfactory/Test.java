package com.sppl.training.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AddressFactory factory = new IndianAddressFactory();
		Address address1 = factory.createAddress(10, "G-10th Street", "Ulsoor", "Bangalore");
		PhoneNumber phoneNumber1 = factory.createPhoneNumber();
		phoneNumber1.setPhoneNumber("90-08344400");
		System.out.println(address1);
		System.out.println(phoneNumber1);
		
		AddressFactory factory2 = new USAddressFactory();
		Address address2 = factory2.createAddress(10, "Block -IV", "MidRand", "Los Angeles");
		PhoneNumber phoneNumber2 = factory2.createPhoneNumber();
		phoneNumber2.setPhoneNumber("44-23112");
		System.out.println(address2);
		System.out.println(phoneNumber2);
	}
}
