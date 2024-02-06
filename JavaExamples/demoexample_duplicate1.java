package JavaExamples;

public class demoexample_duplicate1 {

	public static void main(String[] args) {
	String name[]= {"java","Test1", "Selenium", "java"};
	for(int i=0;i<name.length;i++)
	{
		for(int j=i+1;j<name.length;j++)
		{
			if(name[i]==name[j])
			{
				System.out.println(name[j]);
			}
		}
	}
}
}

