package com.sppl.training.factory;

public class Test {
	public static void main(String[] args) {
		PizzaFactory factory = new VegPizzaFactory();
		Pizza pizza = factory.createPizza();
		System.out.println("Type : "+pizza.getType());
		System.out.println("Price : "+pizza.getPrice());
	}
}
