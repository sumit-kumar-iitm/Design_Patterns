package com.sppl.training.observer2;

import java.util.Observable;
import java.util.Observer;

public class FaultLogger implements Observer {

	/*@Override
	public void handleFault(String message) {
		// TODO Auto-generated method stub
		System.out.println("Writing to log file  "+message);
	}*/

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Writing to log file  "+arg);
	}

}
