package com.sppl.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestWithSerialization {
	public static void main(String[] args) {
		Company company1 = Company.getinstance();
		company1.setName("Intuit");
		try{
			FileInputStream fin = new FileInputStream("company.dat");
			FileOutputStream fout = new FileOutputStream("company.dat");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(company1);
			oout.close();
			company1.setName("Actiance");
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			Company c1 = (Company)oin.readObject();
			oin.close();
			
			fin = new FileInputStream("company.dat");
			oin = new ObjectInputStream(fin);
			Company c2 = (Company) oin.readObject();
			oin.close();
			System.out.println(c1==c2);
			System.out.println(c1.getName());
			System.out.println(c2.getName());
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
