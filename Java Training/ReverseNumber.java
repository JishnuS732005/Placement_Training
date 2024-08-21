import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();
		do {
			System.out.println(i);
			i--;
		} while(i>=1);
	}
}