/**
 * @author Richard Huang
 */
public class GCFAndLCM{
	/**
	 * Method to find the greatest common divisor
	 * of the given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the greatest common divisor
	 */
	public static int GCF(int a,int b){
		while(a!=b){
			if(a>b)
				a-=b;
			else
                b-=a;
        }
        return a;
    }
    
	/**
	 * Method to find the least common multiple of the 
	 * given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - the least common multiple
	 */
    public static int LCM(int a,int b){
        return (a*b)/GCF(a,b);
    }
}