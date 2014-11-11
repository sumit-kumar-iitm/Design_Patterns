package com.sppl.training.iterator;

import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		EmployeeList list = new EmployeeList(3);
		list.addEmployee(new Employee(1, "Raju", "Developer"));
		list.addEmployee(new Employee(2, "Deva", "Accountant"));
		list.addEmployee(new Employee(3, "Arjun", "Team Lead"));
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		//to use enhanced for loop the EmployeeList should be implemented by Iterable
		for(Employee e: list) {
			System.out.println(e);
		}
	}
}
