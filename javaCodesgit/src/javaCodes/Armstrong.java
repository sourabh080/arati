package javaCodes;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actualnum=153;
		int num=actualnum;
		double result=0;
		
		while(actualnum!=0) {
			int n=actualnum%10;
			result=result+Math.pow(n,3);
			actualnum=actualnum/10;
		}
		if(result==num)
		{
			System.out.println(num  + "is an armstrong num");
		}
		else
		{
			System.out.println(num+"is not an armstrong num");

		}

	}

}
