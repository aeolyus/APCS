/**
 * @author Richard Huang
 */
public class StringUtil{
	/**
	 * Converts a string to it piglatin form according to the following rules:
	 * a. If there are no vowels in englishWord, then pigLatinWord is just
	 * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	 * and 'u', and their uppercase counterparts.)
	 * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	 * englishWord + "yay".
	 * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	 * with a vowel), then pigLatinWord is end + start + "ay", where end
	 * and start are defined as follows:
	 * 1. Let start be all of englishWord up to (but not including) its
	 * first vowel.
	 * 2. Let end be all of englishWord from its first vowel on.
	 * 3. But, if englishWord is capitalized, then capitalize end and
	 * "uncapitalize" start.
	 * @param s input text
	 * @return piglatin version of text as a String
	 */
	public static String phraseToPigLatin(String s){
		String a="";
		int loopBreak=1;
        while((s.length()>0||s.indexOf(" ")>=0)&&loopBreak==1){
            if(s.indexOf(" ")<0){//single words
                String c=punc(pig(s),1);
                a+=c;
                loopBreak=0;
            }else{//multi-word lines
                if(s.indexOf(" ")>=0&&s.length()>0){
                    String c=punc(pig(s.substring(0,s.indexOf(" ")))+" ",2);
                    a+=c;
                    s=s.substring(s.indexOf(" ")+1);
                    phraseToPigLatin(s);
                }
            }
        }
        return a;
    }
	
	/**
	 * Main core for translating text to piglatin
	 * @param s input text
	 * @return piglatin version of text as String (unformatted with punctuation yet)
	 */
    private static String pig(String s){
        String c="";
        int j=-1;
        for(int i=1;i<s.length()&&j==-1;i++){//make sure to break after first vowel
            int v=s.charAt(i);
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
                j=i;
            }
        }
        char b=s.toLowerCase().charAt(0);
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u')//check if first char is vowel
            c+=s+"yay";
        else{
            if(s.toUpperCase().charAt(0)==s.charAt(0))//format uppercase
                c+=s.toUpperCase().substring(j).charAt(0)+s.substring(j+1)+s.toLowerCase().substring(0,j).charAt(0)+s.substring(1,j)+"ay";
            else{
                c+=s.substring(j)+s.substring(0,j)+"ay";
            }
        }
        return c;
    }
    
    /**
     * Helps to correct punctuation after translating into piglatin
     * @param c input text
     * @param i mode: 1 for single word mode, 2 for multi-word mode
     * @return text with correct punctuation
     */
    public static String punc(String c,int i){
        if(i==1){//single word mode
            if(c.indexOf(".")>=0)
                c=c.substring(0,c.indexOf("."))+c.substring(c.indexOf(".")+1)+".";
            if(c.indexOf("?")>=0)
                c=c.substring(0,c.indexOf("?"))+c.substring(c.indexOf("?")+1)+"?";
            if(c.indexOf("!")>=0)
                c=c.substring(0,c.indexOf("!"))+c.substring(c.indexOf("!")+1)+"!";
            if(c.indexOf(",")>=0)
                c=c.substring(0,c.indexOf(","))+c.substring(c.indexOf(",")+1)+",";
        }else if(i==2){//multi-word mode
            if(c.indexOf(".")>=0)
                c=c.substring(0,c.indexOf("."))+c.substring(c.indexOf(".")+1,c.indexOf(" "))+"."+c.substring(c.indexOf(" "));
            if(c.indexOf("?")>=0)
                c=c.substring(0,c.indexOf("?"))+c.substring(c.indexOf("?")+1,c.indexOf(" "))+"?"+c.substring(c.indexOf(" "));
            if(c.indexOf("!")>=0)
                c=c.substring(0,c.indexOf("!"))+c.substring(c.indexOf("!")+1,c.indexOf(" "))+"!"+c.substring(c.indexOf(" "));
            if(c.indexOf(",")>=0)
                c=c.substring(0,c.indexOf(","))+c.substring(c.indexOf(",")+1,c.indexOf(" "))+","+c.substring(c.indexOf(" "));
        }return c;
    }
}