package Demojavaprog;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=121, num2 = 0, rem=0 ;
			int temp=num1;
		while (num1 != 0)
		{
			rem = num1 % 10; //676%10 rem=6;
			num2 = num2 * 10 + rem;
			num1 = num1 / 10;

		}
		//System.out.print(num2);
		if(temp==num2)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is  Not Palindrome");	
		}
		}
	}
