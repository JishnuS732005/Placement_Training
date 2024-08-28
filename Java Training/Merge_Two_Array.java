package Problem_Solving;
import java.util.Arrays;
import java.util.Scanner;
public class Merge_Two_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int varuna[] = new int[n];
		int keerthana[] = new int[m];
		for(int i=0;i<n;i++) {
			varuna[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			keerthana[i]=sc.nextInt();
		}
		int o=n+m;
		int c=0;
		int santhosh[] = new int[o];
		for(int i=0;i<n;i++) {
			santhosh[c++]=varuna[i];
		}
		for(int i=0;i<m;i++) {
			santhosh[c++]=keerthana[i];
		}
		Arrays.sort(santhosh);
		

	// Another Method...	
		
	/*	int[] soni=new int[100];
		for(int i=0;i<o;i++) {
		    soni[santhosh[i]]++;
		}
		for(int i1=0;i1<o;i1++) {
			if(soni[santhosh[i1]]>0)
				System.out.print(santhosh[i1]);
			soni[santhosh[i1]]=0;
		}                   
		                    */
		
		for(int i=0;i<o;i++) {                      
			for(int j=i+1;j<o;j++) {                 
				if(santhosh[i]==santhosh[j])               
					santhosh[j]=0;                     
			}                                    
		}                                           
		for(int i=0;i<o;i++) {                           
			if(santhosh[i]!=0)                               
				System.out.print(santhosh[i]);                   
		}                                                  
	}                                                         
}                                                             