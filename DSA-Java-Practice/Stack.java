package practice_java;
import java.util.*;

class Node{
	int data;
	Node next;
}

public class Stack {

	public static void push(Node head) {
		Scanner sc = new Scanner(System.in);
		Node ob = new Node();
		ob.data = sc.nextInt();
		ob.next = head.next;
		head.next = ob;
	}
	
	public static void pop(Node head) {
		if(head.next != null) {
			System.out.println("Popped Element is: "+head.next.data);
			head.next = head.next.next;
		}
	}
	
	public static void peek(Node head) {
		if(head.next != null) {
			System.out.println("Peek Element is: "+head.next.data);
		}
	}
	
	public static void isEmpty(Node head) {
		System.out.println();
		if(head.next != null) {
			System.out.println("Stack Not Empty..");
		}
		else {
			System.out.println("Stack Empty..");
		}
	}
	
	public static void size(Node head) {
		Node t = head.next;
		int c=0;
		while(t != null) {
			c++;
			t=t.next;
		}
		System.out.println("The size of the Stack is: "+c);
	}
	
	public static void isFull(Node head,int n) {
		Node t = head.next;
		int c=0;
		while(t != null) {
			c++;
			t=t.next;
		}
		if(c==n) {
			System.out.println("Stack is full..");
		}
		else {
			System.out.println("Stack is not full");
		}
		
	}
	
	public static void display(Node head) {
		Node t = head.next;
		System.out.println("Elements in Stack: ");
		while(t != null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
	}
	
	
	public static void main(String[] args) {
		Node head = new Node();
		head.next = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			push(head);
		}
		pop(head);
		peek(head);
		display(head);
		isEmpty(head);
		size(head);
		isFull(head,n);
	}
}


