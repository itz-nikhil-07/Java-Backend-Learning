package com.kodewala.Inheritence4;

//Hierarchical Inheritance

class Gun {
	
	public void display(String name) {
		System.out.println("this is Gun " + name);
	}
}

class Ak extends Gun {
	
	@Override
	public void display(String name) {
		super.display(name);
		System.out.println("this is Ak" + name);
	}
}

class Dunaali extends Gun {
	
	@Override 
	public void display(String name) {
		super.display(name);
		System.out.println("12 bore calibar " + name);
	}
}


public class Demo2 {

	public static void main(String[] args) {
		Ak d1 = new Ak();
		d1.display("Single nali");
	}
}