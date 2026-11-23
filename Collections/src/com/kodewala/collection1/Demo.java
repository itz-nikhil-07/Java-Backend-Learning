package com.kodewala.collection1;
import java.util.ArrayList;
/*
 * author Nikhil
 */
public class Demo {
	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<>(); //Declaring the object class 
		//this is where we are adding the objects of students
		students.add("Nikhil"); 
		students.add("Rohit");
		students.add("Daadu");
		students.add("Vineet");
		students.add("Sirsit");
		students.add(null);   //ArrayList allows multiple null at a time in one list
		
		//here we are trying to access the first index student 
		System.out.println("First Student " + students.get(0));
		
		//here we are trying to access the last index of student list 
		System.out.println("Last Student " + students.get(4));
		
		//now will display all the student list 
		for(int index =0; index<students.size(); index++) {
			System.out.println(students.get(index));
		}
	}

}