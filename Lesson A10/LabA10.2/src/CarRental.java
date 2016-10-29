/**
 * @author: Richard Huang
 * 
 * Simulates a car rental key ring generator
 */
public class CarRental{
	
    private String make,model,lic;
	
    /**
     * Constructor that takes a car make, model, and license
     * @param amake make of the car
     * @param amodel model of the car
     * @param alic license of the car
     */
    public CarRental(String amake, String amodel, String alic){
		make=amake;
		model=amodel;
		lic=alic;
	}
    
    /**
     * Computes the keyring of the car based on its license and sets the code variable to that
     */
    public String computeCode(){
    	String code="";
        int num=(int)lic.charAt(0)+(int)lic.charAt(1)+(int)lic.charAt(2)+((int)lic.charAt(4)-48)*100+((int)lic.charAt(5)-48)*10+((int)lic.charAt(6)-48);
        char c=(char)(65+num%26);
        code+=c;
        code+=num;
        return code;
    }
    
    /**
     * Computes and returns the keyring of the car
     * @return Keyring of the car as a string
     */
    public String getCode(){
        return computeCode();
    }
    
    /**
     * Returns the make, model, license, and keyring of the car as a String
     */
    public String toString(){
        return "Make = "+make+"\nModel = "+model+"\n"+lic+" = "+getCode();
    }
}