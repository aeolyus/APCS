/**
 * @author Richard Huang
 */
public class StringUtil{
    public static String reverse(String s){
    	if(s.length()==0)
            return s;
        else
        	return reverse(s.substring(1))+s.substring(0,1);
    }
    
    public static boolean palindrome(String s){
    	return false;
    }
    
    public static String shorthand(String s){
    	return "";
    }
}