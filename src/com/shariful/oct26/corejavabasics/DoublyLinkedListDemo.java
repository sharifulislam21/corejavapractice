//Write java classes to build doubly linked list. 
//Add functionalities like add new node, insert node, 
//delete node, count nodes & print linked list.

package com.shariful.oct26.corejavabasics;

import java.util.Scanner;

class Node								//describes a node with data and next-previous links
{
	int data;
	Node next,prev;
	
	public Node() 
	{	
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	
	public Node(int data, Node next, Node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
		
}

class LinkedList
{
	Node start;
	Node end;
	int size;
	
	public LinkedList() 
	{
		start = null;
		end = null;
		size = 0;
	}
	
	public int getSize()
    {
        return size;
    }
	
	public void insertAtStart(int val)					//Funtion to insert node at beginning
	{
		Node nptr=new Node(val, null, null);
		if(start == null)
        {
			start = nptr;
			end = start;
        }
        else
        {
            start.setPrev(nptr);
            nptr.setNext(start);
            start = nptr;
        }
		size++;
	}
	
	public void insertAtEnd(int val)					//Funtion to insert node at end
	{
		Node nptr=new Node(val, null, null);
		if(start == null)
        {
			start = nptr;
			end = start;
        }
        else
        {
        	nptr.setPrev(end);
        	end.setNext(nptr);
            end = nptr;
        }
		size++;
	}
	
	public void insertAtPos(int val, int pos)			//Funtion to insert node at specified position
	{
		Node nptr=new Node(val, null, null);
		if(pos==1)
		{
			insertAtStart(val);
			
		}
		Node ptr = start;
		for (int i = 2; i <= size; i++)
		{
			if (i == pos)
			{
				Node tmp = ptr.getNext();
				ptr.setNext(nptr);
				nptr.setPrev(ptr);
                nptr.setNext(tmp);
                tmp.setPrev(nptr);
            }
            ptr = ptr.getNext();            
        }
        size++ ;
	}
	
	public void deleteAtPos(int pos)					//Funtion to delete node from specified position
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.getNext();
            start.setPrev(null);
            size--; 
            return ;
        }
        if (pos == size)
        {
            end = end.getPrev();
            end.setNext(null);
            size-- ;
        }
        Node ptr = start.getNext();
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.getPrev();
                Node n = ptr.getNext();
                p.setNext(n);
                n.setPrev(p);
                size-- ;
                return;
            }
            ptr = ptr.getNext();
        }        
    }    

	public void display()								//Function to display nodes in linked list
    {
        System.out.print("\nDoubly Linked List\n");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.getNext() == null) 
        {
            System.out.println(start.getData() );
            return;
        }
        Node ptr = start;
        System.out.print(start.getData()+ " <-> ");
        ptr = start.getNext();

        while (ptr.getNext() != null)
        {
            System.out.print(ptr.getData()+ " <-> ");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "\n");
    }
}

public class DoublyLinkedListDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("-----Doubly Linked List-----");
		char ch;
		do
		{
			System.out.println("Doubly Linked List Operations:");
			System.out.println("1.Insertion at Beginning");
			System.out.println("2.Insertion at End");
			System.out.println("3.Insertion at Specified Location");
			System.out.println("4.Deletion at Specified Location");
			System.out.println("5.Count Nodes");
			
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter element to insert");
					list.insertAtStart( sc.nextInt() );                     
					break;	
				case 2:
					System.out.println("Enter element to insert");
					list.insertAtEnd( sc.nextInt() );                     
					break;
				case 3:
					System.out.println("Enter element to insert");
					int num = sc.nextInt() ;
					System.out.println("Enter position");
					int pos = sc.nextInt() ;
					if (pos < 1 || pos > list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.insertAtPos(num, pos);
					break;
				case 4:
					System.out.println("Enter position");
					int p = sc.nextInt() ;
					if (p < 1 || p > list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.deleteAtPos(p);
					break;
				case 5:
					System.out.println("Size = "+ list.getSize() +" \n");
					break;
				default:
					System.out.println("Invalid Choice Entered!!!\n");
					break;
			}

			list.display();
			System.out.println("\nDo you want to continue...?\n Press y or n\n");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println("Doubly Linked List .... Closed ....!!");
	}
}
