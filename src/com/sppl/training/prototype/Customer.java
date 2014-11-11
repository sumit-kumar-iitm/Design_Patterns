package com.sppl.training.prototype;

public class Customer implements Cloneable{
	private int id;
	private String name;
	private Address address;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer c=(Customer)super.clone();
		c.address = (Address) address.clone();
		return c;
	}
	public Customer(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	public Address getAddress() {
		return address;
	}
}
