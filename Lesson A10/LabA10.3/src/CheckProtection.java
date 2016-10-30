import java.util.Scanner;
/**
 * @author Richard Huang
 */
public class CheckProtection {
	private String amount; //check amount
	private final int MAX_LENGTH;//spaces used to print the amount
	Scanner in = new Scanner(System.in);
	
	/**
	 * Constructor prompts For the amount, rounds the amount to two
	 * decimal places checks if the amount entered has a length less than
	 * MAX_LENGTH If the amount exceeds the MAX_LENGTH, prints an error message
	 * If the amount is within range prints the check amount with commas and
	 * spaces filled with *
	 */
	public CheckProtection(int max) {
		MAX_LENGTH=max;
		System.out.print("Enter the check amount: ");
		amount=in.nextLine();
		
		//Cuts to the nearest two digits after the decimal point and rounds it if hundredth digit is more than five
		if(amount.indexOf(".")>0){
			if(amount.substring(amount.indexOf(".")).length()>3){
				if(amount.charAt(amount.indexOf(".")+3)>52){//rounds
					amount=amount.substring(0,amount.indexOf(".")+2)+(char)((int)(amount.charAt(amount.indexOf(".")+2)+1));
				}else
					amount=amount.substring(0,amount.indexOf(".")+3);
			}else//cuts
				if(amount.substring(amount.indexOf(".")).length()>2)
					amount=amount.substring(0,amount.indexOf(".")+3);
				else
					amount+="0";
		}else
			amount+=".00";//Might not be necessary
		
		//Checks if exceeds max length
		if(amount.length()<=MAX_LENGTH){
			amount=addCommas(amount);
			amount=addAsterisks(amount);
			printAmount();
		}
		else
			System.out.println("Error: Number is too big");
	}

	/**
	 * Adds commas to the number recursively
	 * 
	 * @param s - number as a string
	 * @return - number with commas inserted
	 */
	private String addCommas(String s) {
		//Loops after first comma is added
		if(s.indexOf(",")>0){
			if(s.substring(0,s.indexOf(",")).length()>3){
				s=s.substring(0,s.indexOf(",")-3)+","+s.substring(s.indexOf(",")-3);
				return addCommas(s);
			}
		}else{//Runs the first time since no commas added yet
			if(s.substring(0,s.indexOf(".")).length()>3){
				s=s.substring(0,s.indexOf(".")-3)+","+s.substring(s.indexOf(".")-3);
				return addCommas(s);
			}
		}
		return s;
	}
	
	/**
	 * Adds the stars to fill in leading spaces recursively
	 * 
	 * @param s - number as a string
	 * @return - number with leading stars
	 */
	private String addAsterisks(String s) {
		if(s.length()<MAX_LENGTH){
			s="*"+s;
			return addAsterisks(s);
		}
		return s;
	}

	/**
	 * Prints the amount with leading stars and commas in the between
	 */
	public void printAmount() {
		System.out.println("amount = $"+amount);
	}
}
