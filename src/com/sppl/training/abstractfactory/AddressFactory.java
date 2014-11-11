package com.sppl.training.abstractfactory;

public interface AddressFactory {
	public Address createAddress(int doorNo, String street, String location, String city);
	public PhoneNumber createPhoneNumber();
}
