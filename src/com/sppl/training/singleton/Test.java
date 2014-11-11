package com.sppl.training.singleton;

public class Test {
	public static void main(String[] args) {
		Company company1 = Company.getinstance();
		company1.setName("Intuit");
		System.out.println(company1.getName());
		
		Company company2 = Company.getinstance();
		company1.setName("Actiance");
		System.out.println(company2.getName());
		System.out.println(company1 == company2);
	}
}
