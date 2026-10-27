package com.kodewala4;

public class Instance2 {
	String name;
	
	Instance2() {
		System.out.println("no args constructor initialised");
	}
	
	Instance2 (String name) {
		System.out.println("parameterized constructor initialised");
	}
	
	//calling IIB 
	
	{
		System.out.println("common initialised");
	}
	
	public static void main(String[] args) {
		Instance2 i1 = new Instance2();
		Instance2 i2 = new Instance2("Nikhil");
	}
}
