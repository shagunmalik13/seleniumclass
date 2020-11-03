package classpractise;

public class childconstructor1 extends SuperConstructor
{
	
	public childconstructor1() {
		this(1,2,3);
		System.out.println("this is child default");
	}
	
	childconstructor1(int a){
		System.out.println("this is child 1 parameter");
	}
	childconstructor1(int a,int b){
		this();
		System.out.println("this is child 2 parameter");
	}
	childconstructor1(int a, int b, int c){
		super(1);
		System.out.println("this is child 3 parameter");
	}
	childconstructor1(int a,int b,int c,int d){
		
		this(1,2);
	
		System.out.println("this is child 4 parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childconstructor1 c= new childconstructor1(1,2,3,4);
		

	}

}
