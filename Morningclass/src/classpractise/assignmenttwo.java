package classpractise;

public class assignmenttwo {
	
	//(((((10-2)*2)-2)+2)/2)

	public int subtract(int a,int b) {
		int resultsubtract=a-b;
		System.out.println("output of subtract is "+resultsubtract);
		return resultsubtract;
	}
	public int multiply(int x,int y) {
		int multiplyresult=x*y;
		System.out.println("output of multiply is "+multiplyresult);
		return multiplyresult;
		
	}
	public int add(int a1,int b1) {
		int addresult=a1+b1;
		System.out.println("result of add is " +addresult);
		return addresult;
		
	}
	public static void divide(int x1,int y1) {
		int divideresult=x1/y1;
		System.out.println("result of divide is "+divideresult);
		System.out.println("final result of (((((10-2)*2)-2)+2)/2) is "+divideresult);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		assignmenttwo obj= new assignmenttwo();
		int output=obj.subtract(10, 2);
		int output1=obj.multiply(output, 2);
		int output2=obj.subtract(output1, 2);
		int output3=obj.add(output2, 2);
		divide(output3, 2);
		
		
	}

}
