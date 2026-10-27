package com.kodewala.rev.Inheritence;

class Animal {

}

class Dog extends Animal {

	String name;

	Dog(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("This is Dog " + name);
	}
}

public class Demo {

	public static void main(String[] args) {
		Dog d1 = new Dog("Husky");
		d1.show();
	}
}