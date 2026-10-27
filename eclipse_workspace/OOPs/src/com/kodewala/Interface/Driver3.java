package com.kodewala.Interface;

//interface Camera {
//	default void showFeature() {
//		System.out.println("Camera Feature");
//	}
//}

interface Phone {
	default void showFeature() {
		System.out.println("Phone Feature");
	}
}

class Mobile implements Phone {
	@Override
	public void showFeature() {
		System.out.println("SmartPhone has camera and calling Feature");
	}
}

public class Driver3 {

	public static void main(String[] args) {
		Mobile s = new Mobile();
		s.showFeature();
	}
}

//In this question we tried to make same default signature methods and this creates conflict in main method .
//So class should override the method and modify it to simplfy the conflict and we can call each method by super.interfacename.methodname
//this query didn't worked here cuz default was introduced in java 8 and this is below 8 version .