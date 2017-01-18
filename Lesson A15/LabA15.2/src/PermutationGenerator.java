import java.util.*;
/**
 * @author Richard Huang
 */
public class PermutationGenerator{
	private final Random r;//random
	private ArrayList<Integer> a;//array to store the random list
	/**
	 * Constructor takes in a seed to feed into random
	 * @param seed Seed to feed to random
	 */
	public PermutationGenerator(int seed){
		r=new Random(seed);
	}
	/**
	 * Prints out 10 arrays with permutations of the numbers 1 to 10
	 */
	public void nextPermutation(){
		ArrayList<Integer> temp=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		a=new ArrayList<Integer>(10);
		while(!temp.isEmpty()){
			int n=r.nextInt(temp.size());
			a.add(temp.get(n));
			temp.remove(n);
		}
	}
	/**
	 * Returns the array as a string
	 */
	public String toString(){
	  return a.toString();
	}
}
