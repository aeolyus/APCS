/**
 * @author: Richard Huang
 */
public class RichterScale{
    /**
     * Gets the effect of the earthquake given the magnitude of the equarthquake
     * @param magnitude of the earthquake
     */
    public static void getEffect(double magnitude){
        if(magnitude>=4.5&&magnitude<6){
            System.out.println("Damage to poorly constructed buildings");
        } else if(magnitude>=6&&magnitude<7){
            System.out.println("Many buildings considerably damaged, some collapse");
        } else if(magnitude>=7&&magnitude<8){
            System.out.println("Many buildings destroyed");
        } else if(magnitude>=8){
            System.out.println("Most structures fall");
        } else {
        	System.out.println("No destruction of buildings");
        }
    }
    
}