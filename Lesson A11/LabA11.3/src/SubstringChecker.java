/**
 * @author Richard Huang
 */
public class SubstringChecker implements Checker{
	private String check;
	public SubstringChecker(String s){
		check=s;
	}
	public boolean accept(String text) {
		if(text.indexOf(check)>=0)
			return true;
		return false;
	}
}