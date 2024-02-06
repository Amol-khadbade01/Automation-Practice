package JavaExamples;

public class MethodOverloding {
	
	//example for MethodOverloding
	
	public static void  add(int a,  int b)
	{
		System.out.println(a+b);
		
	}
	public static void  add(int a,  int b, int c)
	{
		System.out.println(a+b+c);
		
	}
	
	public static void  add(float j, float k)
	{
		System.out.println(j+k);
		
	}
	
	
	public static void main(String[] args)
	{
	
		MethodOverloding MD= new MethodOverloding();
		MD.add(12, 30);
		return ;
		


	}

}
