package Demojavaprog;

public class TestDemoprimeNumber {

	public static void main(String[] args) {
		int number = 17;
		boolean isprime = true;

		if (number <= 1) {
			isprime = false;
		} else {
			for (int i = 2; i * i < number; i++) {
				if (number % i == 0) {
					isprime = false;
				}

			}
		}
		if (isprime) {
			System.out.println("Numer is pirme");
		} else {
			System.out.println("Numer is not  pirme");
		}

	}

}
