package com.sppl.training.visitor;

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}


}
