package JavaExamples;

public class TryCatchDemo {
	
static int number=10;
static int num=0;
	

	public static void main(String[] args) {
	
		try {
			
			int answer= number/num;
			System.out.println("The answer is "+answer);
			
			
		} catch (ArithmeticException e)
		{
			System.out.println("Error is "+e.getMessage());
			System.out.println("the number is not divisible by  zero..!");
			
		}
		
	}

}
