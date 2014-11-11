package com.sppl.training.observer;

public class FaultSmser implements FaultListener {

	@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending sms "+message);
	}

}
