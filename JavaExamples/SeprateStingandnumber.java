package JavaExamples;

public class SeprateStingandnumber {

	public static void main(String[] args) 
	{
		String inputString = "1b2@4$d^N!@N#3456";

		StringBuilder numbers = new StringBuilder();
		StringBuilder strings = new StringBuilder();
		StringBuilder specialcharater= new StringBuilder();

		for(int i=0;i<inputString.length();i++)
		{
			char ch=inputString.charAt(i);
			if(Character.isDigit(ch))
			{
				numbers.append(ch);
			}
			else if(Character.isLetter(ch))
			{strings.append(ch);
			}
			else {

				specialcharater.append(ch);
			}
		}

		System.out.println("Numbers: " + numbers.toString());
		System.out.println("Strings: " + strings.toString());
		System.out.println("specialcharater: " + strings.toString());
	}
}
