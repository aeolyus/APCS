public class Rectangle implements Measurable{
    private double length,width;
    public Rectangle(double l,double w){
        length=l;width=w;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public double getArea(){
        return length*width;
    }
    public String toString(){
        return "Rectangle:\nlength = "+length+"\nwidth= "+width+"\nperimeter= "+getPerimeter()+"\narea= "+getArea()+"\n";
    }
}