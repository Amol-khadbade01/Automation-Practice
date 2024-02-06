package JavaProgramExample;

public  class Palindrome {
// print the pari of the number having the sum =24
//to the sum of the pair number from the array list 24
	public static void main(String[] args) {

		int a[]={15, 12, 4, 16, 9, 8, 24, 0};
		//Sum=" 24";
		
		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==24)
				{
					System.out.println("The pair of numbe is "+a[i]+" "+a[j]+"");
				}
			}
		}
		
}
}