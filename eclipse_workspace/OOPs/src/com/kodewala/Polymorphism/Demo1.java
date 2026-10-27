package com.kodewala.Polymorphism;

class Employee {
	
	public void markIn() {
		System.out.println("Employee.markIn()");
	}
}

class HrManager extends Employee {
	
	@Override
	public void markIn() {
		System.out.println("HrManager.markIn()");
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Employee e = new HrManager();
		e.markIn();
	}

}
