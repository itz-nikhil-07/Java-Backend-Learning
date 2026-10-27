package com.kodewala.Inheritence4;

//Multi-level Inheritance


class Intern {
	
	public void details(String name) {
		System.out.println("this is Intern " + name);
	}
}

class Employee extends Intern {
	
	public void details(String name , String userId) {
		super.details(name);
		System.out.println("this is Employeee" + userId);
	}
}

class Manager extends Employee {
	
	public void details(String name ,String userId, String department) {
		super.details(name,userId);
		System.out.println("this is Manager " + department);
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.details("Nik", "Id123","IT");
	}
}