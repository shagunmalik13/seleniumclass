package classpractise;

public class ThreeMethods {
	
	
	public int add(int a,int b) {
	
		int addresult=a+b;
		System.out.println("addition result is "+addresult);
		return a;
		
		
		
	}
	
	public int subtract(int a,int b) {
		int subtractresult=a-b;
		System.out.println("substraction result is "+subtractresult);
		return a;
		
	}
	
	public void multiply(int addresult,int substractresult) {
		int resultmultiply=addresult*substractresult;
		System.out.println("multiply result is "+resultmultiply);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeMethods th =new ThreeMethods();
		int y;
		y= th.add(12, 10);
		int z= th.subtract(12, 10);
	 th.multiply(y,z);
		
		

	}

}
