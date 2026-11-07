package com.kodewala.demo1;

/*
 * author Nikhil
 */

//without implementing cloneable we will not be able to achieve marker Cloneable method 
class Student implements Cloneable { //this is a pre existing/Built -in method available in java for marker interface 
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

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student("Nikhil", 22);
		Student s1 = (Student) s.clone();

		System.out.println(s.name + "," + s.age);
		System.out.println(s1.name + "," + s1.age);
		System.out.println(s.equals(s1));  //false
	}
}