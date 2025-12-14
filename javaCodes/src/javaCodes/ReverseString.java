package javaCodes;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString="Hello";
		String reversedString="";
		for(int i=originalString.length()-1;i>=0;i--)
		{
			reversedString=reversedString+originalString.charAt(i);
		}
				
		System.out.println("originalString:"+originalString);
		System.out.println("reversedString:"+reversedString);

		}

}
