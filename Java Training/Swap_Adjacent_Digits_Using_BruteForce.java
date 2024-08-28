package Problem_Solving;
import java.util.Scanner;
public class Swap_Adjacent_Digits_Using_BruteForce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int arr[] = {1,2,3,4,5,6};
		for(int i=0;i<digit-1;i+=2) {
			arr[i]=arr[i]^arr[i+1];   //(0)// 0^1 -> 1
			arr[i+1]=arr[i]^arr[i+1]; //(1)// 1^2 -> 3
			arr[i]=arr[i]^arr[i+1];   //(1)// 1^3 -> 2 
		}
		for(int k=0;k<digit;k++) {
			System.out.print(arr[k]);
		}
	}
}