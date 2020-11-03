package classpractise;

public class constructorpractise {
	
	public constructorpractise() {
		this(1,2,3,4);
		System.out.println("this is default constructor");
	}
	public constructorpractise(int a) {
		this();
		System.out.println("this is one parameter");
	}
	public constructorpractise(int a,int b) {
		this(1,2,3);
		System.out.println("this is two parameteraized constructor");
	}
	public constructorpractise(int a,int b, int c) {
		this(1);
		
		System.out.println("this is three parameterized");
	}
	
	public constructorpractise(int a, int b, int c, int d) {
		System.out.println("this is four parameterized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorpractise obj = new constructorpractise(2,4);
		
		

	}

}
