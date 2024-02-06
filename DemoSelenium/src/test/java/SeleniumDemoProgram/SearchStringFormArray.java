package SeleniumDemoProgram;

public class SearchStringFormArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,2};
		int  s=4;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
				s=a[i];
			
		}
		System.out.println("The duplicate number is"+ s);
		

	}
	
}
