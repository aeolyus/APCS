/**
 * @author Richard Huang
 */
public class StringUtil{
	 
    /**
     * Reverses the input String
     * @param s Input String
     * @return Reversed String
     */
    public static String reverse(String s){
    	if(s.length()==0)
            return s;
        else{
        	return reverse(s.substring(1))+s.substring(0,1);
        }
    }
    
    /**
     * Checks to see if String is a palindrome
     * @param s Input String
     * @return True if String is palindrome ad false if not
     */
    public static boolean palindrome(String s){
    	s=helpPalindrome(s);
    	if(s.length()>1){
    		if(s.charAt(0)==s.charAt(s.length()-1)){
    			palindrome(s.substring(1,s.length()-1));
    		} else
    			return false;
    	}
    	
    	if(s.length()<2||s.length()>-1)
    		return true;
    	
    	return false;
    }
    
    /**
     * Returns string to lowercase and removes punctuation
     * @param s String input
     * @return String in lowercase and without punctuation
     */
    private static String helpPalindrome(String s){
    	s=s.toLowerCase().trim();
    	if(s.indexOf(",")>=0){
    		s=s.substring(0, s.indexOf(","))+s.substring(s.indexOf(",")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(".")>=0){
    		s=s.substring(0, s.indexOf("."))+s.substring(s.indexOf(".")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(":")>=0){
    		s=s.substring(0, s.indexOf(":"))+s.substring(s.indexOf(":")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf(" ")>=0){
    		s=s.substring(0, s.indexOf(" "))+s.substring(s.indexOf(" ")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("'")>=0){
    		s=s.substring(0, s.indexOf("'"))+s.substring(s.indexOf("'")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("?")>=0){
    		s=s.substring(0, s.indexOf("?"))+s.substring(s.indexOf("?")+1);
    		s=helpPalindrome(s);
    	}else if(s.indexOf("!")>=0){
    		s=s.substring(0, s.indexOf("!"))+s.substring(s.indexOf("!")+1);
    		s=helpPalindrome(s);
    	}
    	return s;
    }
    
    /**
     * Converts a String to shorthand
     * - "AND" to "&"
     * - "FOR" to "4"
     * - "TO" to "2"
     * - "YOU" to "U"
     * @param s Input String
     * @return String written in shorthand
     */
    public static String shorthand(String s){
    	if(s.toUpperCase().indexOf("YOU")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("YOU"))+" U "+s.substring(s.toUpperCase().indexOf("YOU")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("FOR")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("FOR"))+" 4 "+s.substring(s.toUpperCase().indexOf("FOR")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("AND")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("AND"))+" & "+s.substring(s.toUpperCase().indexOf("AND")+3);
    		s=shorthand(s);
    	}else if(s.toUpperCase().indexOf("TO")>=0){
    		s=s.substring(0, s.toUpperCase().indexOf("TO"))+" 2 "+s.substring(s.toUpperCase().indexOf("TO")+3);
    		s=shorthand(s);
    	}
    	return removeVowels(s);
    }
    
    /**
     * Removes the vowels from a String
     * @param s Input String
     * @return String with its vowels removed
     */
    private static String removeVowels(String s){
    	if(s.toLowerCase().indexOf("a")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("a"))+s.substring(s.toLowerCase().indexOf("a")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("e")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("e"))+s.substring(s.toLowerCase().indexOf("e")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("i")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("i"))+s.substring(s.toLowerCase().indexOf("i")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("o")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("o"))+s.substring(s.toLowerCase().indexOf("o")+1);
    		s=removeVowels(s);
    	}else if(s.toLowerCase().indexOf("u")>=0){
    		s=s.substring(0, s.toLowerCase().indexOf("u"))+s.substring(s.toLowerCase().indexOf("u")+1);
    		s=removeVowels(s);
    	}
    	return s;
    }
}