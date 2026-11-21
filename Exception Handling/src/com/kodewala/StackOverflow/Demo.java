package com.kodewala.StackOverflow;
/*
 * author Nikhil 
 * we creatd the Stack Overflow error in this code manually - 
 * Basically it is the resurssion of the method again and agian 
 */
public class Demo {

	public void look() {
		System.out.println("Demo.main()");
		m2();
	}

	public void m2() {
		System.out.println("Demo.main()");
		look();
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.look();
	}
}