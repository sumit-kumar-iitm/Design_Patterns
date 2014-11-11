package com.sppl.training.composite;

public class Manager extends Employee{
	private Employee[] employees;

	public Manager(int pay, Employee[] employees) {
		super(pay);
		this.employees = employees;
	}

	@Override
	public int getDeptPay() {
		// TODO Auto-generated method stub
		int deptPay = getPay();
		for(Employee e: employees) {
			deptPay += e.getDeptPay();
		}
		return deptPay;
	}
	
}
