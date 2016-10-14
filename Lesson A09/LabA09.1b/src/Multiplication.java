/**
 * @author Richard Huang
 * 
 * Recursively multiplies two integers together
 */
public class Multiplication{
	/**
	 * Returns the product of two integers
	 * @param i First integer
	 * @param j Second integer
	 * @return The product of the two integers
	 */
    public double mult(int i, int j){
       if(j<0)
    	   return -i+mult(i,j+1);
       if(i==0||j==0)
    	   return 0;
       return i+mult(i,j-1);
    }
}