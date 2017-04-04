/**
 * @author Richard Huang
 */
public class Triangle implements Measurable{
    private double a,b,c;
    /**
     * Creates a triangle with the given dimensions
     * @param i length of side 1
     * @param j length of side 2
     * @param k length of side 3
     */
    public Triangle(double i,double j,double k){
        a=i;b=j;c=k;
    }
    /**
     * Returns the perimeter of the triangle
     */
    @Override
    public double getPerimeter(){
        return a+b+c; 
    }
    /**
     * Returns the area of the triangle
     */
    @Override
    public double getArea(){
        double p=getPerimeter()/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    /**
     * Returns the dimensions, perimeter, and area of the triangle
     */
    @Override
    public String toString(){
        return "Triangle:\n   side1 = "+a+"\n   side2 = "+b+"\n   side3 = "+c+"\n   perimeter = "+getPerimeter()+"\n   area = "+getArea()+"\n";
    }
}