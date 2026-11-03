package com.Whatsapp.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\nikhi\\Desktop\\Java Backend\\Serialization\\message.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Message message = (Message) ois.readObject();

		System.out.println("De-Ser" + message.getmessage());
	}
}