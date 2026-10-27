package com.kodewala.Interface1;

interface Printer {

	default void showStatus() {
		System.out.println("Printer is ready");
	}
}

interface Scanner {

	default void showStatus() {
		System.out.println("Scanner is ready");
	}
}

class MultiFunctionDevice implements Printer, Scanner {
	@Override
	public void showStatus() {
		
		//calling the interface default methods inside the overriding default methods to resolve the conflicts
		Printer.super.showStatus();
		Scanner.super.showStatus();
		System.out.println("MultiFunction device is ready");
	}
}

public class Main {

	public static void main(String[] args) {
		MultiFunctionDevice md = new MultiFunctionDevice();
		md.showStatus();
	}
}