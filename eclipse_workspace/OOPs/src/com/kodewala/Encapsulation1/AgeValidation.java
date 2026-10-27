package com.kodewala.Encapsulation1;

public class AgeValidation {
	private int age;
	
	public void setAge (int age) {
		if (age > 0 && age < 120) {
		this.age = age;
		}
		else {
			System.err.println("Invalid age");
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		AgeValidation av = new AgeValidation();
		//av.setAge(25);
		av.setAge(-5);
		int result = av.getAge();
		System.out.println(result);
	}
}