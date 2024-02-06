package Demojavaprog;

	public class LongestSubstringWithoutIntegers {
		
	    public static void main(String[] args) {
	    	
		    
	        String inputString = "h7d6sjr32h8wd983qkwhewgef7323jf";
	        String longestSubstring = findLongestSubstringWithoutIntegers(inputString);
	        
	        System.out.println("Longest substring without integers: " + longestSubstring);
	    }

	    private static String findLongestSubstringWithoutIntegers(String inputString) {
	        String[] substrings = inputString.split("\\d+"); // Split by integers
	        String longestSubstring = "";

	        for (String substring : substrings) {
	            if (substring.length() > longestSubstring.length()) {
	                longestSubstring = substring;
	            }
	        }

	        return longestSubstring;
	    }
	}

