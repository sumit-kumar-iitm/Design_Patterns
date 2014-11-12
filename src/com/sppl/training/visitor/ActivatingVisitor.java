package com.sppl.training.visitor;

public class ActivatingVisitor implements CarElementVisitor{

	@Override
	public void visit(Wheel wheel) {
		// TODO Auto-generated method stub
		System.out.println("Rotating "+wheel.getName());
	}

	@Override
	public void visit(Engine engine) {
		// TODO Auto-generated method stub
		System.out.println("Starting Engine");
		
	}

	@Override
	public void visit(Body body) {
		// TODO Auto-generated method stub
		System.out.println("Moving Body");
	}

	@Override
	public void visit(Car car) {
		// TODO Auto-generated method stub
		System.out.println("Travelling in Car");
	}

}
