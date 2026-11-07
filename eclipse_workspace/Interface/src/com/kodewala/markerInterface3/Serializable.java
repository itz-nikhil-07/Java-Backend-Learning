package com.kodewala.markerInterface3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable {
	public static void main(String[] args) {
		Employee emp = new Employee(1234, "Nikhil");

		try {
			FileOutputStream fos = new FileOutputStream(
					"C:\\Users\\nikhi\\Desktop\\Java Backend\\eclipse_workspace\\Interface\\src\\com\\kodewala\\markerInterface3\\Employee");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);
			oos.close();
			fos.close();

			System.out.println("Serialization succesfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}