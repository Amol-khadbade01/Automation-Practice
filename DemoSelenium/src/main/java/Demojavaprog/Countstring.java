package Demojavaprog;

public class Countstring {
//count number of the word in the give string 
	public static void main(String[] args) {

		String inputstr = "Not Just What You Do  Check How you do";
		String[] word = inputstr.split("\\s+");
		System.out.println(word.length);

	}
}
