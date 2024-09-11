package Problem_Solving;
import java.util.*;
class Jishnu {
	int id;
	String name;
	
	void data(int r,String n) {
		id = r;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Constructor {
	public static void main(String[] args) {
		Jishnu sc = new Jishnu();
		sc.data(12,"Smart");
		sc.display();
	}
}