public class ChocolateDriver {

	public static void main(String[] args) {
		Chocolate c = new Chocolate();
		int s = 4;
		int b = 1;
		int g = 9;
		System.out.println(c.canMakeBricks(s, b, g));
		System.out.println(c.numberOfSmallBricksNeeded(s, b, g));
	}

}
