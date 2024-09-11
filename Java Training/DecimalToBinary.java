package Problem_Solving;
import java.util.*;
public class DecimalToBinary {
	public static void main(String[] args) {
			//Decmial To Binary
			int a = -10;
			System.out.println(Integer.toBinaryString(a));
			
			//Binary To Decimal
			int b = 1010;
			String bb = Integer.toString(b); //1010
			System.out.println(Integer.parseInt(bb,2));
			
			//Decimal To Octal
			int c = 45;
			System.out.println(Integer.toOctalString(c));  // 45/8-->5, 5%8-->5
			
			//Octal To Decimal
			int d = 55;                                 // 5*8^1+5*8^0 = 45
			String dd = Integer.toString(d);             
			System.out.println(Integer.parseInt(dd,8));  
			
			//Decimal To HexaDecimal
			int e = 1234;
			System.out.println(Integer.toHexString(e)); // 1234/16-->77-->reminder(2)
														// 77/16-->4-->remainder(13)
														// 4/16-->0-->remainder(4)
			
			//HexaDecimal To Decimal
			String f = "fd2";
			System.out.println(Integer.parseInt(f,16));
			
			//4d2(16)=4^16^2 +13*16^1 +2*16^0
			//		 =4*256  +13*16    +2*1
			//		 =1024+208+2
			//		 =1234
	}
}