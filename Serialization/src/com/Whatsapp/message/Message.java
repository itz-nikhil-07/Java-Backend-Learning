package com.Whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable{
	private static final long serialVersionUID = 1L;  //unique id given by jvm to the class
	private String messageId;
	private String message;
	private transient String userId; //will be skipped during initialization cuz of transient 
	
	Message(String messageId, String message, String userId) {
		this.messageId = messageId;
		this.message = message;
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
