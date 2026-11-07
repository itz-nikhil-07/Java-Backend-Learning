package com.kodewala.markerInterface3;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long SerialVersionUID = 1l;

	int empId;
	String name;

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public void display() {
		System.out.println("empId: " + empId);
		System.out.println("name: " + name);
	}
}