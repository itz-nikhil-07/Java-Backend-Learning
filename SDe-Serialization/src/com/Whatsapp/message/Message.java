package com.Whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = 1L; // unique id given by jvm to the class
	private String messageId;
	private String message;

	Message(String messageId, String message) {
		this.messageId = messageId;
		this.message = message;
	}

	public String getmessageId() {
		return messageId;
	}

	public void setmessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getmessage() {
		return message;
	}

	public void setmessage(String message) {
		this.message = message;
	}
}