package JavaExamples;

public class SwapNumber {

	public static void main(String[] args) {
		// Programm for Swap number

		int a=10,b=20;
		System.out.println("Before swap Value fo A is->"+a);
		System.out.println("Before swap Value fo b is->"+b);
		System.out.println("-----------------");
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Value fo A is->"+a);
		System.out.println("Value fo B is->"+b);


	}

}
