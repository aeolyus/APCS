/** 
 * @author Richard Huang
 */
public class CheckerDriver {
	public static void main(String[] args) {
		Checker myChecker = new SubstringChecker("broccoli");
		System.out.println("broccoli:" + myChecker.accept("broccoli"));
			System.out.println("I like broccoli:" + myChecker.accept("I like broccoli"));
		System.out.println("carrots are great:" + myChecker.accept("carrots are great"));
		System.out.println("Broccoli Bonanza:" + myChecker.accept("Broccoli Bonanza"));
		
		Checker bChecker = new SubstringChecker("beets");
		Checker cChecker = new SubstringChecker("carrots");
		Checker bothChecker= new AndChecker(bChecker, cChecker);
		
		System.out.println("I love beets and carrots:" + bothChecker.accept("I love beets and carrots"));
		System.out.println("beets are great:" + bothChecker.accept("beets are great"));
		System.out.println("artichokes, beets, and carrots:" + bothChecker.accept("artichokes, beets, and carrots"));
		
		Checker aChecker = new SubstringChecker("artichokes");
		Checker kChecker = new SubstringChecker("kale");
		
		Checker a=new SubstringChecker("kale");
		Checker b=new SubstringChecker("artichokes");
		Checker d=new NotChecker(a);
		Checker e=new NotChecker(b);
		Checker c=new AndChecker(d,e);
		
		String s1="chocolate truffles:";
		String s2="kale is great:";
		String s3="Yuck: artichokes & kale:";
		System.out.println(s1+d.accept(s1));
		System.out.println(s2+d.accept(s2));
		System.out.println(s3+d.accept(s3));



		

	}

}
