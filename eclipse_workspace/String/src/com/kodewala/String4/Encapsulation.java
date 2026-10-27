package com.kodewala.String4;

class Student {
	private String name;
	public void SetName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
}
public class Encapsulation {
	public static void main (String[]args) {
		Student s1 = new Student();
		s1.SetName("Nikhil");
		System.out.println(s1.getName());
	}
}