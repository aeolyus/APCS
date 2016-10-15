import java.util.Random;
/**
 * @author: Richard Huang
 */
public class DigitCount {
	Random rand;
	public DigitCount(int seed)
	{
		rand=new Random();
		rand.setSeed(seed);
	}
	/**
	 * Method to generate a new number between 0 and max-1
	 * @param max generates a number smaller than max
	 * @return a random number between 0 and max-1
	 */
	public int generateNewNumber(int max)
	{
		return rand.nextInt(max);
	}
	/**
	 * Recursively counts the number of digits in the given number
	 * @param num - the given number
	 * @return number of digits in num
	 */
	public int countDigits(int num)
	{
		if(num>10)
		  return 1+countDigits(num/10);
		return 1;
	}
}
