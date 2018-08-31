package com.shariful.aug29.linkedlistprograms;

import java.util.Scanner;

public class SinglyLinkedList {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList();
		
		System.out.println("-----Singly Linked List-----");
		char ch;
		do{
			System.out.println("Singly Linked List Operations:");
			System.out.println("1. insert at beginning");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size"); 
            int choice = sc.nextInt();
            switch(choice){
            case 1:
            	System.out.println("Enter integer element to insert");
                list.insertAtStart( sc.nextInt() );    
            	break;
            case 2:
            	System.out.println("Enter integer element to insert");
                list.insertAtEnd( sc.nextInt() );    
            	break;
            case 3:
            	System.out.println("Enter integer element to insert");
            	int num = sc.nextInt();
                System.out.println("Enter position");
                int pos = sc.nextInt();
                if (pos <= 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
            	break;
            case 4:
            	System.out.println("Enter position");
            	int deletepos = sc.nextInt();
            	if(deletepos<1 || deletepos>list.getSize())
            		System.out.println("Invalid position\n");
            	else
            		list.deleteAtPos(deletepos);
            	break;
            case 5:
            	System.out.println("Empty status = "+ list.isEmpty());
            	break;
            case 6:
            	System.out.println("Size = "+ list.getSize() +" \n");
            	break;
            default:
            	System.out.println("Wrong Entry \n ");
            	break;
            }
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0); 
		}while(ch == 'Y'|| ch == 'y');
	}
}
