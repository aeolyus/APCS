import java.util.*;
import java.io.*;
/**
 * @author Richard Huang
 */
public class RoadTrip{
    private ArrayList<GeoLocation> loc=new ArrayList<GeoLocation>();//ArrayList of the road trip
    /**
     * Constructor reads in the geo location from the given file and addst hem to the list
     * @param data file name
     */
    public RoadTrip(String data){
        try{
        Scanner in=new Scanner(new File(data));
        while(in.hasNext()){
            String t1=in.next();
            double t2=Double.parseDouble(in.next());
            double t3=Double.parseDouble(in.next());
            addStop(t1,t2,t3);
        }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates a GeoLocation and adds it to the road trip
     * @param name
     * @param lat
     * @param lon
     */
    private void addStop(String name,double lat,double lon){
        GeoLocation temp=new GeoLocation(name,lat,lon);
        loc.add(temp);
    }
    /**
     * Get the total number of stops in the trip
     * @return total number of stops
     */
    public int getNumberOfStops(){
        return loc.size();
    }
    /**
     * Get the total miles of the trip
     * @return the total miles
     */
    public double getTripLength(){
        double temp=0;
        for(int i=0;i<loc.size()-1;i++){
            GeoLocation a=loc.get(i);
            GeoLocation b=loc.get(i+1);
            temp+=a.distanceFrom(b);
        }
        return temp;
    }
    /**
     * Return a formatted toString of the trip
     */
    public String toString(){
        GeoLocation g=loc.get(0);
        String temp=g.toString();
        for(int i=1;i<loc.size();i++){
            g=loc.get(i);
            temp+="\n"+g.toString();
        }
        temp+="\nStops: "+getNumberOfStops();
        temp+="\nTotal miles: "+getTripLength()+" miles\n";
        return temp;
    }
}