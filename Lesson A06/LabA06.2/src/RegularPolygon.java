/**
 * class RegularPolygon - class to model any regular polygon
 * @author Richard Huang
 */
public class RegularPolygon {
	private int numSides;
	private double sideLength;
	private double R;
	private double r;
	
	/**
	 * Default constructor that makes an equilateral triangle with side lengths of 1
	 */
	public RegularPolygon(){
		//triangle
		numSides=3;
		sideLength=0;
	}
	
	/**
	 * Constructor that takes in the number of sides and the side length of a regular polygon
	 * @param numSides
	 * @param sideLength
	 */
	public RegularPolygon(int numSides,double sideLength){
		this.numSides=numSides;
		this.sideLength=sideLength;
	}
	
	/**
	 * Calculates the length from the center to one of the edges of the polygon
	 */
	private void calcr(){
		r=.5*sideLength*1/Math.tan(Math.PI/numSides);		
	}
	
	/**
	 * Calculates the length from the center to one of the vertexes of the polygon
	 */
	private void calcR(){
		R=.5*sideLength*1/Math.sin(Math.PI/numSides);		
	}
	
	/**
	 * Calculates the inner angle (in degrees) of a vertex of the polygon
	 * @return inner angle (in degrees) of a vertex of the polygon
	 */
	public double vertexAngle(){
		return (double)(180*(numSides-2))/numSides;
	}
	
	/**
	 * Calculates the perimeter of the polygon
	 * @return perimeter of the polygon
	 */
	public double Perimeter(){
		return numSides*sideLength;
	}
	
	/**
	 * Calculates the area of the polygon
	 * @return area of the polygon
	 */
	public double Area(){
		return .5*numSides*Math.pow(getR(), 2)*Math.sin((2*Math.PI)/numSides);
	}
	
	/**
	 * Gets the number of sides of the polygon
	 * @return number of sides of the polygon
	 */
	public int getNumside(){
		return numSides;
	}
	
	/**
	 * Gets the side length
	 * @return polygon side length
	 */
	public double getSideLength(){
		return sideLength;
	}
	
	/**
	 * Calculates and sets the current R and returns it
	 * @return R
	 */
	public double getR(){
		calcR();
		return R;
	}
	
	/**
	 * Calculates and sets the current r and returns it
	 * @return r
	 */
	public double getr(){
		calcr();
		return r;
	}
}