package com.Whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization = new MessageSerialization();
		Message message = new Message("MSG1","Hi Nikhil","user123");
		
		messageSerialization.serialize(message);
	}
}