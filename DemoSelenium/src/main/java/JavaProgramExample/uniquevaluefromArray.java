package JavaProgramExample;

import java.util.HashSet;

public class uniquevaluefromArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,10,10,16,12,1};
		
		HashSet<Integer> uniqueset= new HashSet<Integer>();
		for(int number:arr)
		{
			uniqueset.add(number);
		}
		System.out.println("Unique element are");
		for(int uniquenumber:uniqueset)
		{
			System.out.println(uniquenumber);
		}
}}
