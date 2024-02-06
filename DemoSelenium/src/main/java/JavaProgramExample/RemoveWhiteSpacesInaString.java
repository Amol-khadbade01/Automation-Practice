package JavaProgramExample;

public class RemoveWhiteSpacesInaString {

	public static void main(String[] args) {

		// String =AUTOMATION
		// NITA

		// System.out.println("Strings before swapping: " + str1 + " " + str2);
		// str1="good"
		// str2="morning"

		String inputString;
		//String stringWithoutSpaces = inputString.replace(" ", "").replace("\t", "").replace("\n", "");
		// Initial strings
		String str1 = "good";
		String str2 = "morning";

		System.out.println("Before swapping:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);

		// Swapping using a temporary variable
		String temp = str1;
		str1 = str2;
		str2 = temp;

		System.out.println("\nAfter swapping:");
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
	}
}
