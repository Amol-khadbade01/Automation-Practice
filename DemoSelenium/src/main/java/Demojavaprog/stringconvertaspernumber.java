package Demojavaprog;

public class stringconvertaspernumber {
	// String input = = "4a3b3e6t";

	// Expected output - aaabbbcccc
	public static void main(String[] args) {
		String input = "4a3b3e6t";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (Character.isDigit(currentChar)) {
				int count = Character.getNumericValue(currentChar);
				char nextChar = input.charAt(++i);
				for (int j = 0; j < count; j++) {
					result.append(nextChar);
				}
			}
		}
		String output = result.toString();
		System.out.println(output);

	}

}
