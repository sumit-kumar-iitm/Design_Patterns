package com.sppl.training.observer;

import java.util.ArrayList;
import java.util.List;

public class FaultMesssageGenerator {
	private List<FaultListener> list = new ArrayList<FaultListener>();
	
	public void addFaultListener(FaultListener listener) {
		list.add(listener);
	}
	public void removeFaultListener(FaultListener listener) {
		list.remove(listener);
	}
	
	public void faultOccurred(String message) {
		for(FaultListener listener: list) {
			listener.handleFault(message);
		}
	}
}
