package DSA;
import java.util.*;

class Node2{
	int data;
	Node2 next;
}

public class SumOfOddAndEvenElements {
	
	public static void insert(Node2 head) {
		Node2 ob = new Node2();
		Scanner sc = new Scanner(System.in);
		ob.data = sc.nextInt();
		ob.next = head.next;
		head.next = ob;
	}
	
	public static void SumOfOdd(Node2 head) {
		Node2 t = head.next;
		int s=0;
		while(t != null) {
			if(t.data % 2 != 0) {
				s += t.data;
			}
			t = t.next;
		}
		System.out.println("Sum Of Odd Elements: "+s);
	}
	
	public static void SumOfEven(Node2 head) {
		Node2 t = head.next;
		int s=0;
		while(t != null) {
			if(t.data % 2 == 0) {
				s += t.data;
			}
			t = t.next;
		}
		System.out.println("Sum Of Even Elements: "+s);
	}
	
	public static void display(Node2 head) {
		Node2 t = head.next;
		while(t != null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node2 head = new Node2();
		head.next = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			insert(head);
		}
		display(head);
		SumOfOdd(head);
		SumOfEven(head);
	}
}


