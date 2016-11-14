/**
 * @author Richard Huang
 */
public class NotChecker implements Checker{
	private Checker check;
	public NotChecker(Checker c){
		check=c;
	}
	public boolean accept(String text) {
		return !check.accept(text);
	}

}
