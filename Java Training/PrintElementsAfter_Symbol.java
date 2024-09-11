package Problem_Solving;
import java.util.Scanner;
public class PrintElementsAfter_Symbol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Email: ");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='@') {
				for(int j=i+1;j<str.length();j++) {
					System.out.print(str.charAt(j));
				}
			}
		}
	}
}