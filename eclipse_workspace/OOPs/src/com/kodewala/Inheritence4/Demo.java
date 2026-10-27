package com.kodewala.Inheritence4;

//Single Inheritance

class Subject {
	
	public void display(String name) {
		System.out.println("This  is: " + name);
	}
}

class Science extends Subject {
	
	public void display (String name ,int marks ) {
		super.display(name);
		System.out.println("Mark is: " + marks);
	}
}

public class Demo {

	public static void main(String[] args) {
		Science s1 = new Science();
		s1.display("Maths", 91);
	}
}