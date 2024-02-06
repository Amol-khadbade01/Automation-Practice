package Demojavaprog;

public class Starpattern {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 0; i < rows; i++)
		{
			System.out.print(" ");
            // Print spaces before the stars
            for (int j = 0; j < i; j++) 
            {
                System.out.print("");
            }

            // Print stars
            for (int k = 0; k < 2 * (rows - i) - 1; k++) 
            {
               System.out.print("*");
            }
		
            // Move to the next line after each row
          System.out.println();
	}

	}
	
}


