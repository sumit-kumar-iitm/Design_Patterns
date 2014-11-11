package com.sppl.training.proxy;

public class BusinessImpl implements BusinessIntf{

	@Override
	public String process() {
		// TODO Auto-generated method stub
		System.out.println("doing some process");
		return "done";
	}
	
}
