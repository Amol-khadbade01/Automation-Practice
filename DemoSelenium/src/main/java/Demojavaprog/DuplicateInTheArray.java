package Demojavaprog;

public class DuplicateInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 3};

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Check for duplicate elements
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element: " + array[i]);
                }
            }
        }
	}

}
