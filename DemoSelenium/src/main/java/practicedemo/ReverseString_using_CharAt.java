package practicedemo;

import org.apache.commons.math3.fraction.Fraction;

public class ReverseString_using_CharAt {

	public static void main(String[] args) {

		// Rerverse the string using CharAt Function

		String First_string = "Automaion Testing";
		String Second_string = " ";
		char ch;
		for (int i = 0; i < First_string.length(); i++) {
			ch=First_string.charAt(i);
			Second_string=ch+Second_string;
		}
		System.out.println(Second_string);

	}

}
