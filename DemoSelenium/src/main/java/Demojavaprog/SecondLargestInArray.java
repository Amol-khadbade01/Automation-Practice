package Demojavaprog;

import java.util.Arrays;

public class SecondLargestInArray 
{

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		int[] array = {10, 5, 8, 20, 15};
		int second_largest=0;
	     // Sort the array in descending order
     Arrays.sort(array);
     
     second_largest=array[array.length-2];
     System.out.print(second_largest);
		
          
	}
}


  