package JavaProgramExample;

public class LinearSearch {

	
	public static void main(String[] args)
	{
		int arr[]= {100,200,300,400,500,600};
		
		int search_element=100 ,i; 
		
		for(i=0;i<arr.length;i++)
		{
			if(search_element==arr[i])
			{
				System.out.println( search_element + " Element is present at location-->" +(i+1));
				break;
			}
			
		}
		if(i==arr.length)
		{
			System.out.println(" Element is not prestn " + search_element );
		}
		
	}
}