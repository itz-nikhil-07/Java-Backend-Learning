package com.kodewala.Interface;

interface Calculator {
	static void showInfo() {
		System.out.println("This is a Calculator");
	}
}

class BasicCalculator implements Calculator {

}

public class Main {

	public static void main(String[] args) {
		Calculator.showInfo();  //accessing interface static method
		//BasicCalculator b = new BasicCalculator();
		//through class object we cannot access static method 
	}
}