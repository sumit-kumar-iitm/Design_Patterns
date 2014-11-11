package com.sppl.training.iterator;

import java.util.Iterator;

public class EmployeeList implements Iterable<Employee>{
	private Employee[] employees;
	private int index;
	public EmployeeList(int size) {
		employees = new Employee[size];
	}
	
	public void addEmployee(Employee e) {
		employees[index++] = e;
	}
	
	@Override
	public Iterator<Employee> iterator() {
		// TODO Auto-generated method stub
		return new EmployeeListIterator(employees);
	}
}
