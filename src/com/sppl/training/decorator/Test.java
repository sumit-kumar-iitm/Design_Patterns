package com.sppl.training.decorator;

public class Test {
	public static void main(String[] args) {
		BasicCar basicCar1 = new BasicCar();
		GPSCar gpsCar1 = new GPSCar(basicCar1);
		System.out.println("***********Describing GPSCar***********");
		gpsCar1.describe();
		
		BasicCar basicCar2 = new BasicCar();
		ACCar acCar1 = new ACCar(basicCar2);
		System.out.println("**********Describing ACCar*************");
		acCar1.describe();
		
		BasicCar basicCar3 = new BasicCar();
		ACCar acCar3 = new ACCar(basicCar3);
		GPSCar gpsCar3 = new GPSCar(acCar3);
		System.out.println("*******Describing ACCar with GPS**********");
		gpsCar3.describe();
	}
}
