package Demojavaprog;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestDemo11 {

	public static void main(String[] args) {

		int inputarry[] = { 10, 30, 20, 50 };

		int higest = 0;
		for (int i = 0; i < inputarry.length; i++) {
			if (inputarry[i] > higest)

			{
				higest = inputarry[i];
			}
		}
		System.out.println(higest);

		// Arrays.sort(inputarry);

		// int result=(inputarry[inputarry.length-1]);

		// System.out.println(result);

		// String s1 = new String("HELLO");

		// String s2 = new String("HELLO");
		// s1.concat("Amol");

		// StringBuffer sb= new StringBuffer("amol");
		// sb.append("khadbade");

		// System.out.println(s1 == s2);
		// System.out.println(s1);
		// System.out.println(sb);

		// System.out.println(s1.equals(s2));

	}

}
