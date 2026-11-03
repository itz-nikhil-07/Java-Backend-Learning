package com.Whatsapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization { 
	public void serialize(Message message) throws IOException {
		FileOutputStream fis = new FileOutputStream("message.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(message); //writing
		oos.close();
	}
}
