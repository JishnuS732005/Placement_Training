package Problem_Solving;
import java.util.Scanner;
public class Train_SeatNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Seat number : ");
		int Seat_no = sc.nextInt();
		if(Seat_no<=72) {
			Seat_no = Seat_no%8;
			switch(Seat_no) {
			case 1:
				System.out.println("Left Upper Berth");
				break;
			case 2:
				System.out.println("Left Middle Berth");
				break;
			case 3:
				System.out.println("Left Lower Berth");
				break;
			case 4:
				System.out.println("Right Upper Berth");
				break;
			case 5:
				System.out.println("Right Middle Berth");
				break;
			case 6:
				System.out.println("Right Lower Berth");
				break;
			case 7:
				System.out.println("Side Upper Berth");
				break;
			case 8:
				System.out.println("Side Lower Berth");
				break;
			}
		}
		else {
			System.out.println("Only 72 Seats are available..");
		}
		System.out.println("Happy Journey...");
	}
}