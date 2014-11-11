package com.sppl.training.observer2;

public class Test {
	public static void main(String[] args) {
		FaultMesssageGenerator generator = new FaultMesssageGenerator();
		generator.addObserver(new FaultLogger());
		generator.addObserver(new FaultMailer());
		generator.addObserver(new FaultSmser());
		generator.faultOccurred("Network Failure");
	}
}
