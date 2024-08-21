import java.util.Scanner;
public class ArmstrongNumber {
	static boolean isArmStrongNumber(int number) {
		String digits = Integer.toString(number);
		int numDigits = digits.length();
		int sum = 0;
		for(int i=0;i<numDigits;i++) {
			int digit=Character.getNumericValue(digits.charAt(i));
			sum += Math.pow(digit, numDigits);
		}
		return sum==number;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int number = sc.nextInt();
		if(isArmStrongNumber(number)) {
			System.out.println(number+" is a ArmStrongNumber.");
		}else {
			System.out.println(number+" is not a ArmStrongNumber.");
		}
	}
}
