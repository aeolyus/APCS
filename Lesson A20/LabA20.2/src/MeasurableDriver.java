import java.util.*;
/**
 * @author Richard Huang
 */
public class MeasurableDriver{
    public static void main(String args[]){
        ArrayList<Measurable> test=new ArrayList<Measurable>();//add a bunch of random shapes to an arraylist
        test.add(new Circle(1));
        test.add(new Rectangle(1,1));
        test.add(new Triangle(3,4,5));
        test.add(new SingingRectangle(2,2));
        test.add(new Circle(1.5));
        test.add(new Rectangle(1,1.5));
        test.add(new Triangle(7,24,25));
        test.add(new Circle(2));
        test.add(new Rectangle(2,3));
        test.add(new Triangle(11,60,61));
        for(Measurable m:test){
            System.out.println(m.toString());//print out every shape in the arraylist
        }
    }
}