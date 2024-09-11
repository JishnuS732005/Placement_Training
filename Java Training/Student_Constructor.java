package Problem_Solving;
import java.util.Scanner;
class Student {
void display(String n,int r,String d,String m,String add,String g,int x,int a) {
        //System.out.println(n+" "+r+" "+d+" "+m+" "+add+" "+g+" "+x+" "+a);
        System.out.println("Student Details");
        System.out.println(n);
        System.out.println(r);
        System.out.println(d);
        System.out.println(m);
        System.out.println(add);
        System.out.println(g);
        System.out.println(x);
        System.out.println(a);
    }
}
public class Student_Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String nam = sc.nextLine();
        System.out.print("Enter your rollno: ");
        int roll = sc.nextInt();
        System.out.print("Enter your Department: ");
        String dept = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter your Mail: ");
        String maill = sc.nextLine();
        System.out.print("Enter your Address: ");
        String addr = sc.nextLine();
        System.out.print("Enter your Gender: ");
        String gen = sc.nextLine();
        System.out.print("Enter your Mark: ");
        int marks = sc.nextInt();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        
        Student student = new Student();
        student.display(nam,roll,dept,maill,addr,gen,marks,age);
    }
}