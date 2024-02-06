package Demojavaprog;

public class TestD {

	public static void main(String[] args) {

		String str = "HELLO";
		int[] charCount = new int[256];
		for (char ch : str.toCharArray()) {
			charCount[ch]++;
		}
		// Print the character count
		System.out.println("Character count in the given string:");
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + " - " + charCount[i]);
			}
		}
	}
}