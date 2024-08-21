class Institution{
	String Institution_Name="Ksr Institution.";
	String Place="Tiruchengode";
}
class Ksrct extends Institution{
	String Department="AIML";
	String Batch="2022-2026";
}
class AIML extends Ksrct{
	int RollNo=20;
	String Name="Jishnu S";
	int Age=20;
	String Address="Salem";
	String EmailID="itsmejishnu7@gmail.com";
}

public class Inheritance {
	public static void main(String[] args) {
		AIML aiml=new AIML();
		
		System.out.println(aiml.Institution_Name);
		System.out.println(aiml.Place);
		System.out.println(aiml.Department);
		System.out.println(aiml.Batch);
	}
}
