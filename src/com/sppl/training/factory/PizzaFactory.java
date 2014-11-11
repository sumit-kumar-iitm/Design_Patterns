package com.sppl.training.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public interface PizzaFactory {
	public Pizza createPizza();
	/*public static Pizza createPizza(String type) {
		Pizza pizza=null;
		if(type.equals("veg")) {
			pizza = new VegPizza();
		}
		else if(type.equals("chick")) {
			pizza = new ChickenPizza();
		}
		try {
			FileInputStream in = new FileInputStream("pizza.properties");
			Properties props = new Properties();
			props.load(in);
			String className = props.getProperty(type);
			Class cls = Class.forName(className);
			pizza = (Pizza) cls.newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pizza;
	}*/
}
