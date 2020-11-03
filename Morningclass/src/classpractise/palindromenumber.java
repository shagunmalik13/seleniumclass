package classpractise;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int oldnumber=number;
		int sum=0;
		while(number>0) {
			int r=number%10;  //121%10=1, 12%10=2,1%10=1, 
			sum=sum*10+r; //0*10+1=1, 1*10+2=12, 12*10+1=121
			number=number/10; //121/10=12,12/10=1, 1/10=0
			
		}
		if(oldnumber==sum) {
			System.out.println("number is palindrome" +oldnumber);
		}
		else {
			System.out.println("number is not palindrome");
		}

	}

}
