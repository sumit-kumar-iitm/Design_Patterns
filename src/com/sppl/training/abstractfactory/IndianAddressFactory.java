package com.sppl.training.abstractfactory;

public class IndianAddressFactory implements AddressFactory {
	
	@Override
	public PhoneNumber createPhoneNumber() {
		// TODO Auto-generated method stub
		return new IndianPhoneNumber();
	}

	@Override
	public Address createAddress(int doorNo, String street, String location,
			String city) {
		// TODO Auto-generated method stub
		return new IndianAddress(doorNo, street, location, city);
	}

}
