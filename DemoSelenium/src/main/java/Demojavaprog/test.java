package Demojavaprog;

public class test {

	public static void main(String[] args) {

		String str = "amrutaamol";
		int vowelcount = 0;

		for (int i = 0; i < str.length(); i++) {
			char vowel = str.charAt(i);
			
			if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
			{
				System.out.println(vowel);
				vowelcount++;
			}
		}
		System.out.println(vowelcount);

	}
}
