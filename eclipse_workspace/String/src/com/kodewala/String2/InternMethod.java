package com.kodewala.String2;

public class InternMethod {
	public static void main(String[] args) {
		String s = "Kodewala"; // SCP
		String s1 = "Academy"; // SCP
		String s4 = "KodewalaAcademy"; // created in SCP
		String s3 = s + s1; // created in Heap
		System.out.println(s3);
		System.out.println(s4 == s3); // false
		System.out.println(s4 == s3.intern()); // true
		System.out.println(s3 == s4);
		s3 = s3.intern();
		System.out.println(s4 == s3); // true
	}
}
//intern method makes the object one copy from heap to string 