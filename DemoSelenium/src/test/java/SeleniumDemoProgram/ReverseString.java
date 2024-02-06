package SeleniumDemoProgram;

public class ReverseString {
	
	public static void main(String[] args) 
	{
		String Frist_name = "Amol khadbade", Second_name = "";
		char ch;

		for(int i=0;i<Frist_name.length();i++)
		{
		
			ch=Frist_name.charAt(i);
			Second_name=ch+Second_name;
			//System.out.print(ch);
			
		}
		
		System.out.println(Second_name);
	}
	
	

}
