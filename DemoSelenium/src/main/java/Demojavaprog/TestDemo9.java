package Demojavaprog;

public class TestDemo9 
{
	public static void main(String[] args) {

		int number = 10;
		boolean isprime = true;
		
		if (number <= 1)
		{
			isprime = false;

		}
		else
		{
			for(int i=2;i*i<=number;i++)
			{
				if(number%i==0)
				{
					isprime=false;
					break;
				}
			}
		}
		if(isprime)
		{
			System.out.println("Number is prime "+isprime);
		}
		else
		{
			System.out.println("Number is Not prime "+isprime);
		}

	}
}
