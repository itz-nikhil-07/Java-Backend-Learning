package com.kodewala.markerInterface3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializable {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\nikhi\\Desktop\\Java Backend\\eclipse_workspace\\Interface\\src\\com\\kodewala\\markerInterface3\\Employee");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			emp.display();
			
			ois.close();
			fis.close();
			
			System.out.println("De-Serialization Successful");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}