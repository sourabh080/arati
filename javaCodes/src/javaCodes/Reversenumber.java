package javaCodes;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalnum=12345;
		int reversednum=0;
		while(originalnum!=0) {
			int lastDigit=originalnum%10;
			reversednum=reversednum*10+lastDigit;
			originalnum=originalnum/10;
			
		}
		
		System.out.println("Reversed number:"+reversednum);

	}

}
