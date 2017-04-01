public class Circle implements Measurable{
    private double radius;
    public Circle(double i){
        radius=i;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius; 
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Circle:\nradius = "+radius+"\nperimeter= "+getPerimeter()+"\narea= "+getArea()+"\n";
    }
}