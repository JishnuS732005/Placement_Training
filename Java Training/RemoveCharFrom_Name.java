package Problem_Solving;
import java.util.Scanner;
public class RemoveCharFrom_Name {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String str = sc.next();
		char ch = sc.next().charAt(0);
		for(int i=0;i<str.length();i++) {
		    if(str.charAt(i)!=ch)
		        System.out.print(str.charAt(i));
		}
	}
}