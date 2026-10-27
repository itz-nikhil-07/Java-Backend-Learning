package com.kodewala.Interface;

interface Bank {
	// by default this variable is public static final so can't be modified
	int Interest_Value = 7;
}

class SBI implements Bank {

}

public class Demo {

	public static void main(String[] args) {
		System.out.println(Bank.Interest_Value);
		// this variable can't be modified
	}
}