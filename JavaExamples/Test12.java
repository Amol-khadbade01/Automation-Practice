package JavaExamples;

public class Test12 {

	public static void main(String[] args) {
// Reverse String  
		
		String String_frist="Amol khadbade", Second_string="";
		char ch;
		System.out.println("The Sting befor Reverse"+String_frist);	
		for(int i=0;i<String_frist.length();i++)
		{
			ch= String_frist.charAt(i);
			Second_string=ch+Second_string;
			
					
		}
		
		System.out.println("After Reverse the string is "+Second_string);
		
		


}
}

