package com.sppl.training.iterator;

import java.util.Iterator;

public class EmployeeListIterator implements Iterator<Employee> {
	private Employee[] employees;
	private int index;
	public EmployeeListIterator(Employee[] employees) {
		// TODO Auto-generated constructor stub
		this.employees = employees;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < employees.length)
			return true;
		else
			return false;
	}

	@Override
	public Employee next() {
		// TODO Auto-generated method stub
		return employees[index++];
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
