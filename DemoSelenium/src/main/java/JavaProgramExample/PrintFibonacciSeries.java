package JavaProgramExample;

public class PrintFibonacciSeries {

	public static void main(String[] args) {
		
		int number_1=0, number_2=1, count=5 , i,number_3;
		 
		 System.out.println(number_1 +  number_2);
		 //System.out.print("number_1 "+ "n"  +" number_2:");
		 for(i=2;i<count;i++)
		 {
			 number_3=	number_1+number_2;
			 number_1=number_2;
			 number_2=number_3;
				System.out.println(number_3);
		}
	
		 
	}

}
