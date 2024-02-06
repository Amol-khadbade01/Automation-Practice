package JavaExamples;

public class ReverseString {
// program for reverse String 
	public static void main(String[] args) {
		String Frist_String="Amol khadbade", Second_String=" ";
		char ch;
		System.out.println("String Before Reverse"+Frist_String);
		for(int i=0;i<Frist_String.length();i++)
		{
			ch=	Frist_String.charAt(i);
			Second_String=ch+Second_String;
		}
		
			
		System.out.println("After Reverse the string is "+Second_String);
		System.out.println("============================================");
		
		// Second Way usingn StingBuffer to reverse String
		String mystring="SeleniumTest";
		StringBuffer buffer=new StringBuffer(mystring);
		buffer.reverse();
		System.out.println("The Reverse Sting  is "+buffer);
		
		
		
		/*
		 * String myString="Amolkhadbade"; StringBuffer buffer=new
		 * StringBuffer(mystring); buffer.reverse();
		 * System.out.println("The reverse String is "+buffer);
		 */	 
	}
	
	
	

}
