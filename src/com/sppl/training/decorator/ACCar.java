package com.sppl.training.decorator;

public class ACCar implements FourWheeler{
	private FourWheeler fWheeler;
	public ACCar(FourWheeler fWheeler) {
		super();
		this.fWheeler = fWheeler;
	}
	@Override
	public void describe() {
		// TODO Auto-generated method stub
		fWheeler.describe();
		System.out.println("Add A/C");
	}

}
