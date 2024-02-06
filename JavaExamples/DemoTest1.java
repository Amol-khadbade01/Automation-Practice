package JavaExamples;

public class DemoTest1 {

	public static void main(String[] args) {
		
		String frist_String="interview", Second_string=" ";
		char ch;
		
		for(int i=0 ;i<frist_String.length();i++)
		{
			ch=frist_String.charAt(i);
			Second_string=ch+Second_string;
			
			
		}
		
		System.out.println(Second_string);

	}

}
