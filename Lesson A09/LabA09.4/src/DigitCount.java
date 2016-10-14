import java.util.Random;
/**
 * @author Richard Huang
 */
public class DigitCount {
	private Random rand;
	public DigitCount(int seed){
		Random rand = new Random();
		rand.setSeed(seed);
	}
	/**
	 * Method to generate a new number between 0 and max-1
	 * @param max generates a number smaller than max
	 * @return a random number between 0 and max-1
	 */
	public static int generateNewNumber(int max)
	{
		int i=rand.nextInt(max-1)+1;
		return i;
	}
	/**
	 * Recursively counts the number of digits in the given number
	 * @param num - the given number
	 * @return number of digits in num
	 */
	public static int countDigits(int num)
	{
		int count=0;
		if(num>0)
		  count=1+countDigits(num/10);
		return count;
	}
}
