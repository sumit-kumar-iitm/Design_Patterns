package com.sppl.training.abstractfactory;

public abstract class PhoneNumber {
	private String phoneNumber;

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public abstract String getIsdCode();
	
	public String toString() {
		return getIsdCode()+"-"+phoneNumber;
	}
}
