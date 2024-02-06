package SeleniumDemoProgram;

public class FindDuplicate {
	
	//find the duplicate number

	public static void main(String[] args) 
	{
		
	int a[]= {1,2,12,4,5,4,2,5,6,10,34,12,2};
	 
//Find the Big number from given array 
	
	for(int i=1;i<a.length;i++)
		
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[j]);
				
			}
		}
		
	}
		
		
		
		
	}

}
