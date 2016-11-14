/**
 * @author Richard Huang
 */
public class AndChecker implements Checker{
	private Checker s1,s2;
	public AndChecker(Checker ps1,Checker ps2){
		s1=ps1;
		s2=ps2;
	}
	public boolean accept(String text) {
		if(s1.accept(text)&&s2.accept(text))
			return true;
		return false;
	}
}
