package Problem_Solving;
import java.util.Scanner;
public class Name_To_ASCII_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
		    int a = str.charAt(i);
		    System.out.println(a);
		}
	}
}