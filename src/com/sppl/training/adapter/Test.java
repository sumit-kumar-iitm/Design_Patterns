package com.sppl.training.adapter;

public class Test {
	public static void main(String[] args) {
		ThreeWheeler t = new Auto();
		FourWheeler f = new FourWheelerAdapter(t);
		f.travel();
		TravelUtility.goToOffice(f);
	}
}
