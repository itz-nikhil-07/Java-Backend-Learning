package com.loops3;

public class Employee {

	public static void main(String[] args) {
		int emp[] = {101,102,103,104,105};
		
		for (int i=emp.length-1; i  >= 0; i--) {
			System.out.println("Processing employee:" + emp[i]);
		}
		
	}

}
//The rule for reversing the loop is to put -1