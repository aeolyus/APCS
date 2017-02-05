/**
 * Determines the primes less than or equal to n using the 
 * Sieve of Eratosthenes
 * @author Richard Huang
 */
public class Eratosthenes {
	private int primes=0;
	private int[] list;
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n){
	    list=new int[n];//set up an array
	    for(int i=0;i<n-1;i++)
	    	list[i]=i+2;
	    
	    for(int i=2;i<list.length;i++)//make a list of primes
	    	for(int j=0;j<list.length;j++)
	    		if((list[j]%i==0)&&(list[j]/i!=1))
	    			for(int k=j;k<list.length-1;k++)
	    				list[k]=list[k+1];
    }
	/** Count the number of primes
	 * 
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes(){
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				primes++;
		return primes;
	}
	/**
	 * returns a list of primes less than or equal to n
	 * @return
	 */
	public int[] listOfPrimes(){
		return list;
	}
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 */
	public String toString(){
		String s="";
		for(int i=0;i<list.length;i++)
			if(list[i]!=0)
				s+=list[i]+" ";
		return s+"\nNumber of primes less than or equal to "+list.length+" = "+countPrimes();
	}
}
