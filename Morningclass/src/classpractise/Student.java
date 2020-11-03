package classpractise;

public class Student {
	int age, roll_no;
	
	public void display1() {
		System.out.println("WELCOME ALL");
	}
 public void display2() {
	 System.out.println("Automation is easy");
	 
 }
 
 public static void main (String[] args)
 {
	 Student s1=new Student();
	 s1.age=19;
	 s1.roll_no=22;
	 System.out.println("value of age is " + s1.age);
	 System.out.println("value of roll no is " + s1.roll_no);
	 s1.display1();
	 s1.display2();
 }
 
 
	
}
