package practicedemo;

import java.util.Arrays;

public class findLargNumberFormArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 40, 30, 70, 90, 80 };
		int second_largest_number=0;
		Arrays.sort(arr);
		second_largest_number=arr[arr.length-1];
		System.out.println(second_largest_number);
		
		
		
		
	}

}
