package com.shariful.mar4.chatapp;

import java.util.TreeMap;

public class Chatroom implements Comparable<Object>{

	private String name;
	
	private TreeMap<Long, Message> messageMap=new TreeMap<Long,Message>();
	
	public Chatroom(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeMap<Long, Message> getMessageMap() {
		return messageMap;
	}

	public void setMessageMap(TreeMap<Long, Message> messageMap) {
		this.messageMap = messageMap;
	}

	public Message pushMessage(User user, String msgTxt)
	{
		Message toReturn = new Message(user,msgTxt);
		this.messageMap.put(System.currentTimeMillis(),toReturn);
		return toReturn;
	}
	
	@Override
	public String toString() {
		return "Chatroom [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		return this.name.compareTo(((Chatroom)o).getName());
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name.equals(((Chatroom) obj).getName())) {
			return true;
		} else {
			return false;
		}
	}
}
