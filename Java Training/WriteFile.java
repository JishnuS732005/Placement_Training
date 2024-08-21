import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("Text.txt");
			file.write("This file having some information about the students\n");
			file.write("Name: Jishnu S, Age: 20\n");
			file.write("Want to become Software Developer.");
			file.close();
			System.out.println("Some information is written into the File.");
		}
		catch(IOException e) {
			System.out.println("Error..");
			e.printStackTrace();
		}
	}
}