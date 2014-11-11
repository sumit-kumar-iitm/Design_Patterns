package com.sppl.training.prototype;

public class Test {
	public static void main(String[] args) {
		Address address = new Address("KR Puram", "Bangalore");
		Customer c1 = new Customer(1, "Arjun", address);
		try {
			Customer c2 = (Customer)c1.clone();
			System.out.println("printing c1");
			System.out.println(c1);
			System.out.println("printing c2");
			System.out.println(c2);
			System.out.println(c1==c2);
			System.out.println(c1.getAddress() == c2.getAddress());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
