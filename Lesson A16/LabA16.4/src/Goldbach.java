/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 * @author Richard Huang
 */
public class Goldbach {
	private Eratosthenes e;
	private final int N;
	private int[] list;

	/**
	 * Constructor creates the list of primes using the class Eratosthenes and
	 * initializes N to the passed in value of n
	 * 
	 * @param n
	 *            - number to be written as a sum of two primes
	 */
	public Goldbach(int n){
		N=n;
		e=new Eratosthenes(n);
		list=e.listOfPrimes();
	}

	/**
	 * Returns a string that includes all the prime pairs that add up to N
	 * 
	 * @return string with the all the prime pairs that add up to N
	 */
	public String sumOfTwoPrimes(){
		int t=0,c=0;
		String s=N+" ";
		String temp="";
		for(int i=0;i<list.length;i++){
			for(;t<list.length;t++)
				if(list[i]+list[t]==N&&(list[i]!=0&&list[t]!=0)){
					if(i<=t)
						temp+=" = "+list[i]+" + "+list[t];
					c++;
				}
			t=0;
		}
		s+=temp;
		if(c==0)
			s+=" not expressible as sum of two primes";
		return s;
	}
}