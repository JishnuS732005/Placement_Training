import java.util.Scanner;
public class Concatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname,lname;
		System.out.println("Enter First name: ");
		fname = sc.nextLine();
		System.out.println("Enter Last name: ");
		lname = sc.nextLine();
		System.out.println(fname+" "+lname);
	}
}
