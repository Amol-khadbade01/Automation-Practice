package Demojavaprog;

public class TestDemo5 {
	
	//print the pair of the number which having the sum=20

	public static void main(String[] args) {

		int a[] = { 15, 5, 10, 10, 19, 1, 18, 2 ,2 ,2 ,18};
		// sum=20;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 20) {
					System.out.println(""+a[i]+" ,"+a[j]+"");
				}
			}
		}
	}

}
