/**
 * @author Richard Huang
 */
public class Negation {
	
	/**
	 * Method that returns the negated String of binary properly
	 * @param s Input String of binary
	 * @return "Negative of [original String of binary]: [negated String of binary]"
	 */
	public static String negate(String s){
		return "Negative of "+s+": "+helpNegate(s);
	}
	
	/**
	 * Negates a String of binary by flipping all 1's to 0's and vice versa
	 * @param s Input String of binary
	 * @return Negated String of binary
	 */
	private static String helpNegate(String s){
		if(s.length()>0){
			if(s.charAt(0)==48){
				return "1"+helpNegate(s.substring(1));
			}else if(s.charAt(0)==49){
				return "0"+helpNegate(s.substring(1));
			}else{
				return s.charAt(0)+helpNegate(s.substring(1));
			}
		}
		return s;
	}
}
