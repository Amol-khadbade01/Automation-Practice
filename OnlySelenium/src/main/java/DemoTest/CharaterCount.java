package DemoTest;

public class CharaterCount {

	public static void main(String[] args) {
		String str = "Hello";
		int[] strcount = new int[256];
		// Count occurrences of each character
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			strcount[ch]++;
		}
		// Display the character count
		for (int i = 0; i < strcount.length; i++) {
			if (strcount[i] > 0) {
				System.out.println((char) i + "-" + strcount[i]);
			}
		}

	}

}
