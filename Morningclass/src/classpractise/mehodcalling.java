package classpractise;

public class mehodcalling {
	public void method() {
		this.three(1, 2, 3);
		System.out.println("this is default method");
		
	}
	
	public void one(int a) {
		this.four(1,2,3,4);
		System.out.println("this is one parameter method");
		
	}
	
	public void two(int a,int b) {
		this.one(1);
		System.out.println("this is 2 paramenter method");
		
	}
	public void three(int a, int b, int c) {
		System.out.println("this is 3 parameter");
	}
	public void four(int a, int b, int c, int d) {
		this.method();
		System.out.println("this is 4 parameter");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mehodcalling m = new mehodcalling();
		m.two(1, 1);

	}

}
