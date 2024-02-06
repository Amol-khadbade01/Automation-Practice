package Demojavaprog;

public class TestDemo13 {

	public static void main(String[] args) {

		String inputString = "capgemini";
		int vowelCount = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);

			if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
					|| currentChar == 'u') {

				System.out.println("vowels is : " + currentChar);
				vowelCount++;
			}

		}
		System.out.println("Number of vowels: " + vowelCount);

	}
}
