package DSA;
import java.util.*;

class Node3{
	int data;
	Node3 next;
}

public class NumberOfOddAndEvenElements {
	
	public static void insert(Node3 head) {
		Node3 ob = new Node3();
		Scanner sc = new Scanner(System.in);
		ob.data = sc.nextInt();
		ob.next = head.next;
		head.next = ob;
	}
	
	public static void NumberOfOddElements(Node3 head) {
		Node3 t = head.next;
		int c=0;
		while(t != null) {
			if(t.data % 2 != 0) {
				c++;
			}
			t=t.next;
		}
		System.out.println("Number of Odd Elements: "+c);
	}
	
	public static void NumberOfEvenElements(Node3 head) {
		Node3 t = head.next;
		int c=0;
		while(t != null) {
			if(t.data % 2 == 0) {
				c++;
			}
			t=t.next;
		}
		System.out.println("Number of Even Elements: "+c);
	}
	
	public static void display(Node3 head) {
		Node3 t = head.next;
		System.out.println("Elements in the Node: ");
		while(t != null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node3 head = new Node3();
		head.next = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			insert(head);
		}
		display(head);
		NumberOfOddElements(head);
		NumberOfEvenElements(head);
	}
}


