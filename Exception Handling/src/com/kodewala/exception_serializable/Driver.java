package com.kodewala.exception_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Driver {
	public static void main(String[] args) {
		Employee emp = new Employee("Nikhil", 101, 127000);

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\nikhi\\Desktop\\Java Backend\\Exception Handling\\employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			oos.close();
			System.out.println("Object Serialized successfully");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}