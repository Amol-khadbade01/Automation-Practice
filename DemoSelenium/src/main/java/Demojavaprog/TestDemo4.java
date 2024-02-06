package Demojavaprog;

public class TestDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str="Reader", revstring="";
		 int strlength= str.length();
		 for(int i=(strlength-1);i>0;i++)
		 {
			 revstring = revstring + str.charAt(i);
			 
		 }
		 if (str.toLowerCase().equals(revstring.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		

	}

}
