package com.sppl.training.observer;

public class Test {
	public static void main(String[] args) {
		FaultMesssageGenerator generator = new FaultMesssageGenerator();
		generator.addFaultListener(new FaultLogger());
		generator.addFaultListener(new FaultMailer());
		generator.addFaultListener(new FaultSmser());
		generator.faultOccurred("Network Failure");
	}
}
