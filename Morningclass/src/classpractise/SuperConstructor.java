package classpractise;

public class SuperConstructor {
	
	public SuperConstructor() {
		this(1,2,3);
		System.out.println("this is parent class default constructor");
	}
	SuperConstructor(int a){
		this(1,2);
		System.out.println("this is parent class one parameter consturctor");
		
	}
	SuperConstructor(int a, int b ){
		this(1,2,3,4);
		System.out.println("this is parent class 2 parameter constructor");
	}
	SuperConstructor(int a,int b,int c){
		System.out.println("this is parent class 3 parameter constructor");
	}
	SuperConstructor(int a,int b,int c, int d){
		this();
		System.out.println("this is parent class 4 parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
