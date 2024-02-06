package javaSpark;

public class Palindrome {
//  check  the given number  palindrome or not 
	// A palindrome number is a number that is same after reverse.
	public static void main(String[] args) {
		int num1 = 546, num2 = 0, rem=0;
		int temp = num1;
		while (num1!= 0) {
			
			rem = num1 % 10;
			
			num2 = num2 * 10 + rem;
			num1 = num1/10;

		}
		if (temp==num2) {
			System.out.println(" Given number is plindrome--> " + num2);
		} else {
			System.out.println("Given number is not plindrome-->  " + num2);
		}

	}

}
