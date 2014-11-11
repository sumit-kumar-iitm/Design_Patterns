package com.sppl.training.observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FaultMesssageGenerator extends Observable {
	private String errorOccurred;
	/*private List<FaultListener> list = new ArrayList<FaultListener>();

	public void addFaultListener(FaultListener listener) {
		list.add(listener);
	}
	public void removeFaultListener(FaultListener listener) {
		list.remove(listener);
	}
	*/
	public void faultOccurred(String message) {
		/*for(FaultListener listener: list) {
			listener.handleFault(message);
		}*/
		this.errorOccurred = message;
		setChanged();
		notifyObservers(errorOccurred);
	}
}
