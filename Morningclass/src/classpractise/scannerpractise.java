package classpractise;

import java.util.Scanner;

public class scannerpractise {
	
	public int mul(int x1, int x2) {
		int c= x1*x2;
		return c;
		
	}
	public int sub(int x3,int x4) {
		int c=x3-x4;
		return c;
		
	}
	int add(int x5,int x6) {
		int c= x5+x6;
	
		return c;
	}
	void divide(int x7, int x9) {
		int c= x7/x9;
		System.out.println(c);
		System.out.println("output of (x1*x2)-x3)+x4)-x5)/x6 is" +c);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//(x1*x2)-x3)+x4)-x5)/x6
		System.out.println("enter values");
		Scanner s = new Scanner(System.in);
		int x1,x2,x3,x4,x5,x6;
		x1=s.nextInt();
		x2=s.nextInt();
		x3=s.nextInt();
		x4=s.nextInt();
		x5=s.nextInt();
		x6=s.nextInt();
		
		scannerpractise obj=new scannerpractise();
		int mulresult=obj.mul(x1, x2);
		int subresult=obj.sub(mulresult, x3);
		int addresult=obj.add(subresult, x4);
		int minus2=obj.sub(addresult, x5);
		obj.divide(minus2, x6);
		
		
		
		
		
		

	}

}
