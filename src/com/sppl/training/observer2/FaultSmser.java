package com.sppl.training.observer2;

import java.util.Observable;
import java.util.Observer;

public class FaultSmser implements Observer {

	/*@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending sms "+message);
	}*/

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Sending sms "+arg);
	}

}
