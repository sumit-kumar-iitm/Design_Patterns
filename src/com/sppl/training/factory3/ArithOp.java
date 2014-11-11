package com.sppl.training.factory3;

public class ArithOp {
	private char operator;
	
	public ArithOp(char operator) {
		this.operator = operator; 
	}
	
	public int perform(int first, int second) {
		int result = 0;
		switch(operator) {
		case '+' :
			result = first + second;
			break;
		case '-' :
			result = first - second;
			break;
		case '*' :
			result = first * second;
			break;
		case '/' :
			result = first / second;
			break;
		}
		return result;
		
	}
}
