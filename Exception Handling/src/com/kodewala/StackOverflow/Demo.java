package com.kodewala.StackOverflow;

public class Demo {

	public void look() {
		System.out.println("Demo.main()");
		m2();
	}

	public void m2() {
		System.out.println("Demo.main()");
		look();
	}
}