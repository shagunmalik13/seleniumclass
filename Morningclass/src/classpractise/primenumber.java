package classpractise;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=7;
		int half=number/2;
		int d=0;
		for(int i=2;i<half;i++) {
			if(number%i==0) {
				System.out.println("its not prime number" +number);
				d=1;
				break;
			}
			//else {
			//System.out.println("its prime number");
			//	break;
			
		}
		if(d==0) {
			System.out.println("its prime number");
		}

	}

}
