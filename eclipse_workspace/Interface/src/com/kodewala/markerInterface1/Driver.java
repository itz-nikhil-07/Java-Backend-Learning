package com.kodewala.markerInterface1;

interface CloneEligible {

}

class Studnet implements CloneEligible {
	String name = "Nikhil";
}

class Employee implements CloneEligible {
	String name = "Daadu";
}

public class Driver {
	public static void main(String[] args) {

		Studnet s = new Studnet();
		Employee e = new Employee();

		if (s instanceof CloneEligible) {
			System.out.println("student hurrray");
		}
		if (e instanceof CloneEligible) {
			System.out.println("employee hurrray");
		} else {
			System.out.println("Nothing");
		}
	}
}

//trying to check whether these classes are eligible for cloning or not .
//instance of is the keyword to check . 