package Demojavaprog;

import java.util.ArrayList;
import java.util.HashSet;

public class TestDemo6 {
	// Removing Duplicate Elements From ArrayList Using HashSet
	public static void main(String[] args) {

		// Removing Duplicate Elements From ArrayList Using HashSet
// Here created the array list and store the array element with duplicate value 
		// Constructing An ArrayList

		ArrayList<String> DuplicateElement = new ArrayList<String>();
		DuplicateElement.add("Java");
		DuplicateElement.add("Java");
		DuplicateElement.add("Java");
		DuplicateElement.add("Java");
		DuplicateElement.add("Apple 14");
		DuplicateElement.add("Moto s14");
		DuplicateElement.add("Apple 15");
		DuplicateElement.add("Apple 15");
		DuplicateElement.add("Apple 14");
		DuplicateElement.add("DataBase");
		DuplicateElement.add("C++");
		DuplicateElement.add("SQl");
		DuplicateElement.add("SQl");
		DuplicateElement.add("DataBase");
		DuplicateElement.add("C++");
		DuplicateElement.add("SQl");
		DuplicateElement.add("SQl");
		
		HashSet<String>setElement= new HashSet<String>(DuplicateElement);
		ArrayList<String>finalElement= new ArrayList<String>(setElement);
		System.out.println(finalElement);
		

	}
}
