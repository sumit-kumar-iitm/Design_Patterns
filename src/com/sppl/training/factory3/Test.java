package com.sppl.training.factory3;

public class Test {
	public static void main(String[] args) {
		ArithOp op1 = new ArithOpfactory().createArithOp('+');
		System.out.println(op1.perform(10, 4));
		
		ArithOp op2 = new ArithOpfactory().createArithOp('*');
		System.out.println(op2.perform(10, 4));
		
		System.out.println(op1==op2);
		
		ArithOp op3 = new ArithOpfactory().createArithOp('+');
		System.out.println(op3.perform(10, 4));
		
		System.out.println(op1==op3);
		System.out.println(op2==op3);
	}
}
