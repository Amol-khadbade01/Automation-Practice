package JavaExamples;

public class DuplicateNumber {

	public static void main(String[] args) {
		// find ther duplicate number from array
		/*
		 * String name[]= {"Java","Java","test", "Selenium", "amol"};
		 * 
		 * //compaire each element for(int i=0;i<name.length;i++) { for(int j=
		 * i+1;j<name.length;j++) { if(name[i].equals(name[j])) {
		 * System.out.println("The duplicate element is "+name[i]); } } }
		 * 
		 * 
		 */
		String name[] = { "java", "test", "java", "Selenium" };
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					System.out.println(name[j]);
				}
			}
		}

	}
}
