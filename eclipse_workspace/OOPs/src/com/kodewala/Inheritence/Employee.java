package com.kodewala.Inheritence;

class Employee {
	String name = "Nikhil";
	String address = "Banglore";
	//private String empCode = "1234"; //private cannot be called cuz its scope is limited 
	
	public void markIn(String empId) {
		System.out.println("Marking In " + empId);
	}
}

class Manager extends Employee {
	
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		//System.out.println(empcode); //private variable not visible..
		markIn(address);
	}
}