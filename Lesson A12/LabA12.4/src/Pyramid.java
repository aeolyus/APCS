/**
 * @author Richard Huang
 */
public class Pyramid {
	/**
	 * Method to make a pyramid
	 * @param n - height of the pyramid
	 */
  public static void pyramid(int n){
    for(int i=1;i<n*2;i+=2) {
      for(int j=1; j<n-i/2;j++)
        System.out.print(" ");
      for(int j=0;j<i;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}