package com.kodewala.String1;

public class Driver1 {
	String name;
	
	Driver1(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Driver1 d1 = new Driver1("Nikhil");
		Driver1 d2 = new Driver1("Nikhil");
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}
}


//public class Driver1 {
//	public static void main(String[] args) {
//		String s1 = new String ("Kodewala");
//		String s2 = new String ("Kodewala");
//		
//		System.out.println(s1 == s2 );
//		System.out.println(s1.equals(s2));
//	}
//}