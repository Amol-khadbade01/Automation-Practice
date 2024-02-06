package Demojavaprog;

import java.util.HashMap;
import java.util.Map;

public class countChar {

	public static void main(String[] args) {

		String str = "HELLO";
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Count occurrences of each character
		for (char ch : str.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		// Print the character count
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
