package com.kodewala.markerInterface1;

class Student implements Cloneable {
	String name;
	int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Driver1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student("Nikhil", 22);
		Student s1 = (Student) s.clone();

		System.out.println("Original: " + s.name + " " + s.age);
		System.out.println("Clone:" + s1.name + " " + s.age);

	}
}