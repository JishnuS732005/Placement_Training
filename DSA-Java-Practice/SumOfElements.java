package DSA;
import java.util.*;

class Node1{
	int data;
	Node1 next;
}


public class SumOfElements {
	
	public static void insert(Node1 head) {
		Scanner sc = new Scanner(System.in);
		Node1 ob = new Node1();
		ob.data = sc.nextInt();
		ob.next = head.next;
		head.next = ob;
		
	}
	
	
	public static void sum(Node1 head) {
		Node1 t = head.next;
		int s=0;
		while(t != null) {
			s += t.data;
			t = t.next;
		}
		System.out.println("Sum Of Elements: "+s);
	}
	
	
	public static void display(Node1 head) {
		Node1 t = head.next;
		while(t != null) {
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node1 head = new Node1();
		head.next = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			insert(head);
		}
		display(head);
		sum(head);

	}

}
