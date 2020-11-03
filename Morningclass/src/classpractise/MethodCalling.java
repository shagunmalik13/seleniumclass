package classpractise;

import java.util.Scanner;

public class MethodCalling {
	
	public int sum(int x1,int x2) {
		int c=x1+x2;
		System.out.println("value of sum is " +c);
		return c;
		
	}
	public int subtract(int a, int b) {
		int c=a-b;
		System.out.println("value of sub is " + c);
		return c;
	}
	public int mul(int a, int b) {
		int c=a*b;
		System.out.println("value of mul is" +c);
		return c;
	}
	public void divide(int a,int b) {
		int c=a/b;
		System.out.println("result of (x1+x2)-x3)*x4)+x5)/x6) is " +c);
		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println("enter values of functions");
		Scanner s=new Scanner(System.in);
		int x1= s.nextInt();
		int x2= s.nextInt();
		int x3= s.nextInt();
		int x4= s.nextInt();
		int x5 = s.nextInt();
		int x6 = s.nextInt();
		System.out.println("values of function x1 " +x1);
		System.out.println("x2= " +x2);
		System.out.println(" x3= " +x3);
		System.out.println("x4=" +x4);
		System.out.println("x5=" +x5);
		MethodCalling m=new MethodCalling();
		int sumresult=m.sum(x1, x2);
		System.out.println(sumresult);
		int subtractresult=m.subtract(sumresult, x3);
		System.out.println(subtractresult);
	 int mulresult=	m.mul(subtractresult, x4);
	 System.out.println(mulresult);
	 int addtwo=m.sum(mulresult, x5);
	 System.out.println(addtwo);
	 m.divide(addtwo, x6);
	 
	 
	 
	 
		
		
		
		
		
		
	}

}
