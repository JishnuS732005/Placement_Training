package Problem_Solving;
import java.util.*;
class Jish {
	int id;
	String name;
	
	Jish(int r,String n) {
		id = r;
		name = n;
	}
	Jish(){
		/*
		id = j.id;
		name = j.name;     */
	}             
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Copy_Constructor {
	public static void main(String[] args) {
		Jish sc = new Jish(12,"Smart");
		Jish sc1 = new Jish();
		sc1.id = sc.id;
		sc1.name = sc.name;
		sc1.display();
		sc.display();
	}
}