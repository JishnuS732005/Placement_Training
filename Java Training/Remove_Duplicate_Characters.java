package Problem_Solving;
import java.util.Scanner;
public class Remove_Duplicate_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String str = sc.next();
		char ch[] = new char[str.length()];
		ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		    for(int j=i+1;j<ch.length;j++) {
		        if(ch[i]==ch[j])
		            ch[j]='0';
		    }
		    if(ch[i]!='0') {
		        System.out.print(ch[i]);
		    }
		}
	}
}