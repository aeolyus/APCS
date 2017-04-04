/**
 * @author Richard Huang
 */
public class Circle implements Measurable{
    private double radius;
    /**
     * Cretes a circle with the given radius
     * @param i radius of circle
     */
    public Circle(double i){
        radius=i;
    }
    /**
     * Returns the circumference of the circle
     */
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius; 
    }
    /**
     * Returns the area of the circle
     */
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    /**
     * Returns the dimensions, circumference, and area of the circle
     */
    @Override
    public String toString(){
        return "Circle:\nradius = "+radius+"\ncircumference = "+getPerimeter()+"\narea = "+getArea()+"\n";
    }
}