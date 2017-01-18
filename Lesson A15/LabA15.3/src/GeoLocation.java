/**
 * @author Richard Huang
 */
public class GeoLocation{
    private String name;
    private double lat,lon;
    private static final double RADIUS=3959;//Earth radius in miles
    /**
     * Constructs a geo location object with given latitude and longitude
     * @param name name of this geo location
     * @param lat latitude in degrees
     * @param lon longitude in degrees
     */
    public GeoLocation(String name,double lat,double lon){
        this.name=name;
        this.lat=lat;
        this.lon=lon;
    }
    public double distanceFrom(GeoLocation g){
        double theta=Math.sin(Math.toRadians(g.getLat()))*Math.sin(Math.toRadians(lat))+Math.cos(Math.toRadians(g.getLat()))*Math.cos(Math.toRadians(lat))*Math.cos(Math.toRadians(g.getLon()-lon));
        double arcL=Math.acos(theta);
        return arcL*RADIUS;
    }
    /**
     * Returns the name of this geo location
     * @return name of this geo location
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the latitude in degrees of this geo location
     * @return latitude in degrees of this geo location
     */
    public double getLat(){
        return lat;
    }
    /**
     * Returns the longitide in degrees of this geo location
     * @return longitude in degrees of this geo location
     */
    public double getLon(){
        return lon;
    }
    /**
     * returns a string representation of this geo location
     * @returns the string representation
     */
    
    public String toString() 
    {
        return getName()+"(latitude: "+getLat()+", longitude: "+getLon()+")";
    }
}