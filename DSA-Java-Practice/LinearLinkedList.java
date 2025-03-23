package practice_java;
import java.util.Scanner;

class Node{
	int roll;
	Node nxt;
}

class LinearLinkedList{
	public static void insert(Node head){
		int c = 0;
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		Node p = head;
		while(c<(pos-1) && p.nxt != null) {
			c++;
			p = p.nxt;
		}
		if(c==(pos-1)) {
			Node ob = new Node();
			ob.roll = sc.nextInt();
			ob.nxt = p.nxt;
			p.nxt = ob;
		}
		else {
			System.out.println("Pos Exceeds Length.");
		}
		
	}
	
	/*
	
	public static void delete(Node head) {
		
		 Using Position

		Scanner sc = new Scanner(System.in);
		int pos=sc.nextInt();
		int c=0;
		Node p=head;
		while(c<(pos-1) && p.nxt != null) {
			c++;
			p=p.nxt;
		}
		if(c==(pos-1)) {
			p.nxt = p.nxt.nxt;
		}
		else {
			System.out.println("Position Exceeds Length..");
		}
		

		
		// Or Using Element
		
		Scanner sc = new Scanner(System.in);
		int c=0;
		Node p = head;
		int e = sc.nextInt();
		while(p.nxt != null && p.nxt.roll != e) {
			p=p.nxt;
		}
		if(p.nxt == null) {
			System.out.println("Element Exceeds Length..");
		}
		else if(p.nxt.roll == e) {
			p.nxt = p.nxt.nxt;
		}
		
	}
	
	*/
	
	public static void display(Node head){
		Node t = head.nxt;
		while(t != null) {
			System.out.print(t.roll+" ");
			t = t.nxt;
		}
	}
	
	public static void length(Node head) {
		Node t = head.nxt;
		int c=0;
		while(t != null) {
			c++;
			t=t.nxt;
		}
		System.out.println("Length of the List: "+c);
	}
	
	public static void search(Node head) {
		Node t = head.nxt;
		int c=0;
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		while(t != null && t.roll != e) {
			c++;
			t=t.nxt;
		}
		if(t == null) {
			System.out.println("Element not found..");
		}
		else if(t.roll == e) {
			System.out.println("Element found at position: "+(c+1));
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node();
		head.nxt = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			insert(head);
		}
		
		//delete(head);
		length(head);
		search(head);
		display(head);
		
	}
}


