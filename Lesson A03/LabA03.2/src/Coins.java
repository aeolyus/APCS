/**
 * @author Richard Huang
 */
public class Coins {
	private int c;
	public Coins(int coins){
		c=coins;
	}
	public void change(){
		System.out.println(c+" cents =>");
		int q = c/25;
		c-=q*25;
		System.out.println("Quarter(s) "+q);
		int d = c/10;
		c-=d*10;
		System.out.println("Dime(s) "+d);
		int n = c/5;
		c-=n*5;
		System.out.println("Nickel(s) "+n);
		int p =c;
		System.out.println("Penny(s) "+p);
	}
}
