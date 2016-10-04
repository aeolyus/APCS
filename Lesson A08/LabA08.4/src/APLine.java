/**
 * @author Richard Huang
 */
public class APLine {
	private int a,b,c;//line ax+by+c=0
	
	/**
	 * Constructor to create a line with coefficients a and b and a constant c
	 * @param j coefficient of x
	 * @param k coefficient of y
	 * @param l constant
	 */
	public APLine(int j,int k, int l){
		a=j;b=k;c=l;
	}
	
	/**
	 * Gets the slope of the line
	 * @return slope of the line m=-a/b
	 */
	public double getSlope(){
		return -a/(double)b;
	}
	
	/**
	 * Checks if the point is on the line
	 * @param i x coordinate
	 * @param j y coordiante
	 * @return true if on the line and false if not on the line
	 */
	public boolean isOnLine(int i,int j){
		return (a*i+b*j+c)==0;
	}
	
}
