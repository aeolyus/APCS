/**
 * @author Richard Huang
 */
public class WriteSequence {
	/**
	 * Write the sequence of numbers in the descending and then ascending order
	 * @param n numbers in the sequence
	 */
	public static void write(int n){
		if(n>0){
			if(n==1){
				System.out.print(1+" ");
			}else if(n%2==0){
				System.out.print(n/2+" ");
				write(n-2);
				System.out.print(n/2+" ");
			}else if(n%2==1){
				System.out.print((n+1)/2+" ");
				write(n-2);
				System.out.print((n+1)/2+" ");
			}
		}
	}
}
