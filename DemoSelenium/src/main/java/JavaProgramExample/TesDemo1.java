package JavaProgramExample;

public class TesDemo1 {

	public static void main(String[] args) {

		String input = "h7d6sjr32h8wd983qkwhewgef7323jf";

		int start = 0;
		int end = 0;
		int maxStart = 0;
		int maxEnd = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isDigit(c)) {
				// If the character is an integer, update the "start" index
				start = i + 1;
			} else {
				// If the character is not an integer, update the "end" index
				end = i;

				// Calculate the length of the current substring
				int length = end - start + 1;

				// Check if the length is greater than the longest substring found so far
				if (length > maxEnd - maxStart + 1) {
					// Update the indices of the longest substring
					maxStart = start;
					maxEnd = end;
				}
			}
		}

		// Extract the longest substring from the original string
		String longestSubstring = input.substring(maxStart, maxEnd + 1);

		System.out.println("Longest substring without integers: " + longestSubstring);
	}

}
