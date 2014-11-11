package com.sppl.training.singletonenum;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public enum Company implements Serializable{
	instance;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*private Object readResolve() {
		System.out.println("Invoking readResolve");
		instance.setName(name); //to get the same name when we stored object 
		return instance;
	}
	
	private void writeObject(ObjectOutputStream oout) throws IOException {
		System.out.println("Invoking write Object");
		oout.defaultWriteObject();
		oout.writeUTF(name);
	}
	
	private void readObject(ObjectInputStream oin) throws IOException {
		try {
			System.out.println("Invoking read Object");
			oin.defaultReadObject();
			name = oin.readUTF();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
