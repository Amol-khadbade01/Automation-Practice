package JavaProgramExample;

public class Demo_duplicate {

	public static void main(String[] args) {
		int a[] = {10,20,10,30,40,70,40,20};
		int num;
		
		for(int i=0;i<a.length;i++)
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
