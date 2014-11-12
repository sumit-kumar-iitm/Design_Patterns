package com.sppl.training.visitor;

public class Car implements CarElement {
	private CarElement[] elements;
	public Car() {
		elements = new CarElement[] {
				new Wheel("Front Left"), new Wheel("Front Right"), new Wheel("Back Left"), new Wheel("Back Right")
		};
	}
	@Override
	public void accept(CarElementVisitor visitor) {
		// TODO Auto-generated method stub
		for(CarElement element: elements) {
			element.accept(visitor);
		}
		visitor.visit(this);
	}

}
