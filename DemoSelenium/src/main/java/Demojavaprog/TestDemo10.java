package Demojavaprog;

public class TestDemo10 {

	public static void main(String[] args) {

		// Programm for palindrom

		int inputnumber = 141, Reversenumber = 0, reminder = 0;
		int temp = inputnumber;
		while (inputnumber != 0) {
			reminder = inputnumber % 10;
			Reversenumber = Reversenumber * 10 + reminder;
			inputnumber = inputnumber / 10;
		}

		if (temp == Reversenumber) {
			System.out.println("bhau number is paladrom");
		} else {
			System.out.println("bhau dhoka zala");
		}
	}

}
