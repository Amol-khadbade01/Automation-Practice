package Demojavaprog;

public class TestDem03 {

	public static void main(String[] args) {
		String orginalstring = "Hellow Word..!";
		char[] arr = orginalstring.toCharArray();
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
		String result = new String(arr);
		System.out.println(result);
	}
}
