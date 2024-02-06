package JavaExamples;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		
		int num=54321;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
		num=num/10;
		}
		System.out.println("The reverse number is "+rev);
		
		System.out.println("=======================");
		String mystring ="125";
		
		StringBuffer buffer=new StringBuffer(mystring);
		buffer.reverse();
		String data=buffer.toString();
		if(mystring.equals(data))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
		
	}
	
	


}
