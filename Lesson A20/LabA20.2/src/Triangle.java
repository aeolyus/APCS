public class Triangle implements Measurable{
    private double a,b,c;
    public Triangle(double i,double j,double k){
        a=i;b=j;c=k;
    }
    public double getPerimeter(){
        return a+b+c; 
    }
    public double getArea(){
        double p=getPerimeter()/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public String toString(){
        return "Triangle:\nside1 = "+a+"\nside2 = "+b+"\nside3 = "+c+"\nperimeter = "+getPerimeter()+"\narea = "+getArea()+"\n";
    }
}