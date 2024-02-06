package Demojavaprog;
//	cout the the present in sting "Implicit and expicit wait selenium, count number of characters, Hashma
public class TestDemo8 {

	public static void main(String[] args) {
	String first_string="Implicit and expicit wait selenium";
	int total =0;
	
		for(int i=0;i<first_string.length();i++)
	{
		
		if(first_string.charAt(i) !=' ')
		{
			total=total+1;
		}
		
	}
	System.out.println(total);
	

	}

}
