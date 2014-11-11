package com.sppl.training.abstractfactory;

public class USAddressFactory implements AddressFactory {
	
	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new USPhoneNumber();
	}

	@Override
	public Address createAddress(int doorNo, String street, String location,
			String city) {
		// TODO Auto-generated method stub
		return new USAddress(doorNo, street, location, city);
	}

}
