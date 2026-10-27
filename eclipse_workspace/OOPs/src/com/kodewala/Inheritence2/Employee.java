//package com.kodewala.Inheritence2;
//
//public class Employee {
//	String name;
//	int empId;
//	
//	Employee(String name, int empId) {
//		this.name = name;
//		this.empId = empId;
//	}
//	
//	public void displaydetails() {
//		System.out.println(name);
//		System.out.println(empId);
//	}
//}
//
//class Developer extends Employee {
//	
//	String programinglanguage;
//	
//	Developer(String name, int empId, String programinglanguage) {
//		super(name,empId);
//		this.programinglanguage = programinglanguage;
//	}
//	
//	@Override
//	public void displaydetails() {
//		super.displaydetails();
//		System.out.println(programinglanguage);
//	}
//}