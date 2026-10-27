package com.kodewala.rev.Encapsulation;

class Bank {
	
	private int amount; //declearing the variable private to achieve encapsulation 
	//means no outside accessing on data.
	
	/**
	 * We can use setter method to declare the variables and getter method to get the method
	 * @param amount
	 */
	
	public void credit(int amount) {
		System.out.println("Demo.credit()");
	}
}

public class Demo {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.credit(400);
	}
}