package com.kodewala4;

public class Instance3 {

	static int stockquantity = 10;

	{
		System.out.println("The stock quantity is: 20");
	}

	Instance3() {
		System.out.println("The stock quantity is: 30");
	}

	public static void main(String[] args) {
		System.out.println(stockquantity);
		Instance3 i1 = new Instance3();
	}
}