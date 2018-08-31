package com.shariful.mar4.chatapp;

public class User implements Comparable<Object>{

	private String name;
	private String password;
	private Chatroom userChatroom = null;
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Chatroom getUserChatroom() {
		return userChatroom;
	}

	public void setUserChatroom(Chatroom userChatroom) {
		this.userChatroom = userChatroom;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password
				+ ", userChatroom=" + userChatroom + "]";
	}

	public boolean equals(Object obj) {
		if(this.name.equals(((User)obj).getName()))
			return true;
		else
			return false;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.name.compareTo(((User)o).getName());
	}
	
	
}
