package com.sppl.training.factory;

public class VegPizzaFactory implements PizzaFactory{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new VegPizza();
	}

}
