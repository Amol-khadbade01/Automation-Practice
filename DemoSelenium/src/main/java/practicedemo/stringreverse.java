package practicedemo;

public class stringreverse {

	public static void main(String[] args) {

		String str="madam";
		String temp="";
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			//System.out.print(str.charAt(i));
			temp= temp+ str.charAt(i);
		}
		if(str==temp)
		{
			System.out.println("The Given stirn is plandrome " + str);
		}
		else
		{
			System.out.println("The Given stirn is not plandrome " + str);
		}

	}
}