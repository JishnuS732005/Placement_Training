package DSA;
import java.util.*;

class Node4{
	int data;
	Node4 next;
}

public class AlternateElementsInList {

	public static void insert(Node4 head) {
		Node4 ob = new Node4();
		Scanner sc = new Scanner(System.in);
		ob.data = sc.nextInt();
		Node4 p = head;
		while(p.next != null) {
			p = p.next;
		}
		p.next = ob;
		ob = null;
	}
	
	public static void display(Node4 head) {
		Node4 t = head.next;
		System.out.println("Elements in the Node: ");
		while(t != null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.println();
	}
	
	public static void alternateElement(Node4 head) {
		Node4 t =head.next;
		System.out.println("Alternate Elements: ");
		while(t != null) {
			System.out.print(t.data+" ");
			if(t.next != null) {
				t = t.next.next;
			}
			else {
				break;
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node4 head = new Node4();
		head.next = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			insert(head);
		}
		display(head);
		alternateElement(head);		
	}
}



