import java.io.File;
import java.io.IOException;
public class FileCreation {
	public static void main(String[] args) {
		try {
			File myObj = new File("MyFile.txt");
			if(myObj.createNewFile()) {
				System.out.print("File is Created: "+myObj.getName());
			}else {
				System.out.println("File is not Created.");
			}
		}
		catch(IOException e) {
			System.out.println("Error..");
			e.printStackTrace();
		}
	}
}