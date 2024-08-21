import java.util.Scanner;
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public void set(int age) {
		if(age>0) {
			this.age = age;
		}else {
			System.out.print("Invalid age.");
		}
	}
}
public class Class_Person{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		int Age = sc.nextInt();
		Person person1 = new Person(Name,Age);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		person1.set(person1.getAge());
	}
}