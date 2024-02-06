package SeleniumDemoProgram;

public class Swapnumber {

	public static void main(String[] args) {
		int a=10, b=20;
		//output shluld be b=10,a=20
		System.out.println("The value of A is "+a);
		System.out.println("The value of B is "+b);
		//without using third varable
		
		a=a+b;
	
		b=a-b;

		a=a-b;
	
		System.out.println("The value of A is "+a);
		System.out.println("The value of B is "+b);
		

	}

}
