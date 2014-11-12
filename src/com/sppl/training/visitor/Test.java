package com.sppl.training.visitor;

public class Test {
	public static void main(String[] args) {
		Car car1 = new Car();
		DisplayVisitor dispVisitor = new DisplayVisitor();
		dispVisitor.visit(car1);
		
		ActivatingVisitor actVisitor = new ActivatingVisitor();
		actVisitor.visit(car1);
	}
}
