package com.kodewala4;

public class Instance1 {
	String name;

	Instance1(String name) {
		super(); // by default it is being called.
		//here in 2nd line instance block always gets executed.
		{
			System.out.println("Your record is being initialised");
		}

		this.name = name;
	}

	// calling IIB Instance init block

	public static void main(String[] args) {
		Instance1 i1 = new Instance1("Nikhil");
		System.out.println(i1.name);
		Instance1 i2 = new Instance1("Sirsit");
		System.out.println(i2.name);
		Instance1 i3 = new Instance1("pulpy");
		System.out.println(i3.name);
	}
}