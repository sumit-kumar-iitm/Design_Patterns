package com.sppl.training.decorator;

public class GPSCar implements FourWheeler{
	private FourWheeler fWheeler;
	
	public GPSCar(FourWheeler fWheeler) {
		super();
		this.fWheeler = fWheeler;
	}
	@Override
	public void describe() {
		// TODO Auto-generated method stub
		fWheeler.describe();
		System.out.println("Add GPS");
	}

}
