package com.kodewala.String1;

public class InternMethod {
	public static void main(String[] args) {
		String s = "Banglore";
		String s1 = "Banglore";
		String s2 = s.intern();
		System.out.println(s2.equals(s));
		System.out.println(s2==s);
		System.out.println(s2==s1);
		System.out.println(s2.equals(s1));
		System.out.println(s==s2);
	}
}