package com.shariful.mar4.chatapp;

public class Message {
	private User sender;
	private String msgText;
	
	public Message(User sender, String msgText) {
		super();
		this.sender = sender;
		this.msgText = msgText;
	}

	@Override
	public String toString() {
		return "[sender=" + sender.getName() + ", msgText=" + msgText + "]";
	}
	
	
	
}
