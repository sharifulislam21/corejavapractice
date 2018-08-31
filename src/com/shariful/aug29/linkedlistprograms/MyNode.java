package com.shariful.aug29.linkedlistprograms;

public class MyNode {

	int data;
	MyNode link;

	public MyNode() {
		data = 0;
		link = null;
	}
	
	public MyNode(int d, MyNode n){
		data = d;
		link = n;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MyNode getLink() {
		return link;
	}

	public void setLink(MyNode link) {
		this.link = link;
	}
	
	
}
