package com.kodewala.exception_checked;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) {
//		String name = null;
//		System.out.println(name.length());

		String className = "com.kodewala.exception_checked.Demooo"; //this is compile time exception which should be handled first 
		try {
			Class.forName(className);
			System.out.println("Class Loaded");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
//these compile time exception are more critical that's why we handle them in compile time and solve it
//Unchecked exception are Runtime exception 