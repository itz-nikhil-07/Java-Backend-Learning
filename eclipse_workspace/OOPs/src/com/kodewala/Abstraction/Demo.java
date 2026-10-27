package com.kodewala.Abstraction;

abstract class Shape {
	
	 abstract double calculateArea();
	 
	 public void displayMessage() {
		 System.out.println("Calculating shape area");
	 }
}

class Circle extends Shape {
	
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	 
	double length;
	double width;
	
	Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	double calculateArea() {
		return length * width;
	}
}

public class Demo {

	public static void main(String[] args) {
		//Circle c1 = new Circle(5);
		Shape c1 = new Circle(5); //making reference as abstract shape class and calling circle child class
		c1.displayMessage();
		System.out.println(c1.calculateArea());
		
		Rectangle r1 = new Rectangle(5,6);
		c1.displayMessage();
		System.out.println(r1.calculateArea());
	}
}