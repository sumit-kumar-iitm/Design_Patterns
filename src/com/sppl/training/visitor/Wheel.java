package com.sppl.training.visitor;

public class Wheel implements CarElement {
	private String name;
	
	public Wheel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stub
		
	}

	

}
