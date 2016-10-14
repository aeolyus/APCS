/**
 * @author Richard Huang
 * 
 * Returns the nth number in the Fibonacci series
 */
public class Fibonacci{
	/**
	 * Takes in an integer n and returns the nth number in the Fibonacci series
	 * @param n integer value for the position in the Fibonacci series
	 * @return nth number in Fibonacci series
	 */
    public int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}