/**
 * @author Richard Huang
 */
public class DigitMatch {
	/**
	 * Counts the number of matching digits in the two given integers
	 * @param i - first integer
	 * @param j - second integer
	 * @return number of matching digits
	 */
	public int countMatch(int i, int j){
		int count=0;
		if(i<10||j<10){
			if(i%10==j%10)
				count++;
		}
		else if(i%10>0||j%10>0){
			if(i%10==j%10)
				count=1+countMatch(i/10,j/10);
			else
				count=countMatch(i/10,j/10);
		}
		return count;
	}
}
