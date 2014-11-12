package com.sppl.training.visitor;

public class Body implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
