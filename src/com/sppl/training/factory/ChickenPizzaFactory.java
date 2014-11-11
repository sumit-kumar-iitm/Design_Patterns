package com.sppl.training.factory;

public class ChickenPizzaFactory implements PizzaFactory{

	@Override
	public Pizza createPizza() {
		// TODO Auto-generated method stub
		return new ChickenPizza();
	}

}
