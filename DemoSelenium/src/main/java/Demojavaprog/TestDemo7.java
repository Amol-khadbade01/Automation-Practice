package Demojavaprog;

public class TestDemo7 {
	//RemoveJunk 
	public static void main(String[] args) {
		//remove all the symbol and undersocr from charater
		
		String String_contain="å°?ç±³ä½“éªŒç‰ˆ latin string 01234567890";
		String String_contain2="@#$@#$@ testing #@$@#$@#$ Selenium !@#$@#$@# &&&& Java";
		
		String_contain=String_contain.replaceAll("[^a-zA-Z0-9]", " ");
		
		String_contain2=String_contain2.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(String_contain);

	}

}
