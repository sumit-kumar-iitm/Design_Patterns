package com.sppl.training.visitor;

public interface CarElement {
	public void accept(CarElementVisitor visitor);
}
