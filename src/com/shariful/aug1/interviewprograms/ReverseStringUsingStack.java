/* Java program to reverse 
   String using Stack */
     
package com.shariful.aug1.interviewprograms;

class Stack{
	int size;
	int top;
	char[] a;
	
	//function to check if stack is empty
	boolean isEmpty(){
		return (top<0);
	}
	
	Stack(int n){
		top=-1;
		size = n;
		a = new char[size];
	}
	
	// function to push element into stack
	boolean push(char x){
		if(top>=size){
			System.out.println("Stack Overflow");
			return false;
		}
		else{
			a[++top] = x;
			return true;
		}			
	}
	
	//function to pop out element from stack
	char pop(){
		if(top<0){
			System.out.println("Stack Empty");
			return 0;
		}
		else{
			char x = a[top--];
			return x;
		}
	}
}

public class ReverseStringUsingStack {

	//function to reverse the string
	public static void reverse(StringBuffer str){
		
		// Create a stack of capacity 
        // equal to length of string
		int n = str.length();
		Stack obj = new Stack(n);
		
		// Push all characters of string 
        // to stack
		for(int i=0; i<n; i++){
			obj.push(str.charAt(i));
		}
		
		// Pop all characters of string 
        // and put them back to str
		for(int i=0; i<n; i++){
			char ch=obj.pop();
			str.setCharAt(i, ch);
		}
		
	}
	
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("shariful");
		reverse(s);
		System.out.println("Reverse String: "+s);
	}
}
