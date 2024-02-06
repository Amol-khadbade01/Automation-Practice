package JavaProgramExample;

public class ReverseString {

	public static void main(String[] args) {
		String string_frist="AMolkhadbade", Second_string= "";
		char ch;
		for(int i=0;i<string_frist.length();i++)
		{
			ch=string_frist.charAt(i);
			Second_string= ch+Second_string;
			
		}
		System.out.println(Second_string);

	}

}
