package com.kodewala.Encapsulation1;

public class Student {
	private String name;
	
	public void setName(String name) {
		this.name =  name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("1234");
		String result = s1.getName();
		//int result = Integer.parseInt("1234"); //Integer in being parsed from String
		System.out.println(result);
	}
}