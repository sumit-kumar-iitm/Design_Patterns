package com.sppl.training.decorator;

public class BasicCar implements FourWheeler{

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		System.out.println("Add Engine");
		System.out.println("Add Wheels");
		System.out.println("Add Body");
	}
	
}
