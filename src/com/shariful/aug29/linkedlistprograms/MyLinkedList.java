package com.shariful.aug29.linkedlistprograms;

public class MyLinkedList {

	MyNode start;
	MyNode end;
	int size;
	
	public MyLinkedList() {
		start = null;
		end = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	/*  Function to display elements  */
	public void display(){
		
		if(size==0){
			System.out.println("Empty List!!");
			return;
		}
		if(start.getLink()==null){
			System.out.println(start.getData());
			return;
		}
		MyNode ptr = start;
		System.out.print(start.getData()+ " -> ");
		ptr = start.getLink();
		
		while(ptr.getLink() != null){
			System.out.print(ptr.getData()+ " -> ");
			ptr = ptr.getLink();
		}
		System.out.println(ptr.getData() + "\n");
	}

	/*  Function to insert an element at begining  */
	public void insertAtStart(int val) {
		MyNode nptr = new MyNode(val, null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else{
			nptr.setLink(start);
			start = nptr;
		}
		
	}

	/*  Function to insert an element at end  */
	public void insertAtEnd(int val) {
		MyNode nptr = new MyNode(val, null);
		size++;
		if(start == null){
			start = nptr;
			end = start;
		}
		else{
			end.setLink(nptr);
			end = nptr;
		}
	}
	
	/*  Function to insert an element at specified position  */
	public void insertAtPos(int val, int pos) {
		MyNode nptr = new MyNode(val, null);
		MyNode ptr = start;
		pos = pos-1;
		for(int i=1; i<size; i++){
			if(i==pos){
				MyNode temp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(temp);
			}
			ptr = ptr.getLink();
		}
		size++;
		
	}

	 /*  Function to delete an element at position  */
	public void deleteAtPos(int pos) {
		if(pos==1){
			start = start.getLink();
			size--;
			return;
		}
		if(pos==size){
			MyNode s = start;
			MyNode t = start;
			while(s!=end){
				t=s;
				s=s.getLink();
				
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		MyNode ptr = start;
		pos = pos-1;
		for(int i=1;i<size-1;i++){
			if (i == pos) 
            {
                MyNode tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
			
		}
		size--;
	}

}
