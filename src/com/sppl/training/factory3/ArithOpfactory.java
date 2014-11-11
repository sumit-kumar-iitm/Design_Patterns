package com.sppl.training.factory3;

import java.util.HashMap;
import java.util.Map;

public class ArithOpfactory {
	private static Map<Character, ArithOp> cache = new HashMap<>();
	
	public static ArithOp createArithOp(char operator) {
		ArithOp op = null;
		if(cache.containsKey(operator)) {
			op = cache.get(operator);
		}
		else {
			op = new ArithOp(operator);
			cache.put(operator, op);
		}
		return op;
	}
}
