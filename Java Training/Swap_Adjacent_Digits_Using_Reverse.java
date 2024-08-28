package Problem_Solving;
import java.util.Scanner;
public class Swap_Adjacent_Digits_Using_Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int n = sc.nextInt();
		int rev = 0, s=0;
		for(int i=n;i>0;i=i/10) {
			int r=i%10;
			rev=rev*10+r;  // 654321
		}
		for(int i=rev;i>0;i=i/100) {
			int r=i%100;
			s=s*100+r;
		}
		System.out.print(s);
	}
}