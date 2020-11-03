package classpractise;

public class assignmentone {
	
	public int sum(int a,int b) {
		int sumresult=a+b;
		System.out.println("output of sum is "+sumresult);
		return sumresult;
		
	}
	public int subtract(int x,int y) {
		
		int subtractresult= x-y;
		System.out.println("subtract value is "+ subtractresult);
		return subtractresult;
	}
	
	public int multiply(int x1,int y1) {
		
		int multiplyresult = x1*y1;
		System.out.println("multiply value is "+ multiplyresult);
		return multiplyresult;
		
	}
	
	public void divide(int a1, int b1) {
		
		int divideresult=a1/b1;
		System.out.println("divide value is "+divideresult);
		System.out.println("final result of /(((((10+2)+2)-2)*2)/2) is "+divideresult);
	
		
	}

	public static void main(String[] args) {
		
		assignmentone fun = new assignmentone();
		int output= fun.sum(10, 2);
		
		int output1=fun.sum(output, 2);
		int sub= fun.subtract(output1, 2);
		int mul= fun.multiply(sub, 2);
		fun.divide(mul, 2);
		
		
		
		
		
		
		
	}

}
