package javaCodes;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,firstnum=0,secondnum=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstnum+",");
			int nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			
		}

	}

}
