/**
 * @author Richard Huang
 */
public class Rectangle implements Measurable{
    private double length,width;
    /**
     * Creates a rectangle with the given dimensions
     * @param l length
     * @param w weidth
     */
    public Rectangle(double l,double w){
        length=l;width=w;
    }
    /**
     * Returns the perimeter of the rectangle
     */
    @Override
    public double getPerimeter(){
        return 2*length+2*width;
    }
    /**
     * Returns the area of the rectangle
     */
    @Override
    public double getArea(){
        return length*width;
    }
    /**
     * Returns the dimensions, perimeter, and area of the rectangle
     */
    @Override
    public String toString(){
        return "Rectangle:\n   length = "+length+"\n   width = "+width+"\n   perimeter = "+getPerimeter()+"\n   area = "+getArea()+"\n";
    }
}