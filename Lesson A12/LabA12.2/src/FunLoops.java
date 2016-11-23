/**
 * @author Richard Huang
 */
public class FunLoops{
	/**
	 * Method to find the first n magic squares
	 * @param n - number of magic squares to find
	 */
    public static void magicSquares(int n){
    	int count=0;
    	String s="";
    	for(int j=1;count<n;j++){
    		int i=(j*(j+1))/2;
    		if(Math.sqrt(i)==(int)Math.sqrt(i)){
    				s+=i+" ";
    				count++;
    		}
    	}
    	System.out.print(s);
    }
}