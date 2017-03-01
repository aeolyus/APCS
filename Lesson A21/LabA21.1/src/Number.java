import java.util.ArrayList;
import java.util.*;
/**
 * @author Richard Huang
 */
public class Number{
    int base,value;
    ArrayList<Digit> digits = new ArrayList<Digit>();
    /**
     * Default constructor to initialize the value to 
     * zero and the base to 10
     * Also initializes the digits
     */
    public Number(){
        base=10;
        value=0;
        convert();
    }
    /**
     * Constructor to initialize the value and base of the number
     * to the given value and base. Also initializes the digits
     * @param val value
     * @param b base
     */
    public Number(int v, int b){
        base=b;
        value=v;
        convert();
    }
    
    /**
     * Method to return the digitsList as String
     * @return String containing the digits of the number
     * 			in the given base
     */
    public String toString(){
    	convert();
        String a="";
        for(Digit d:digits)
            a+=d.toString();
        if(a.equals(""))
        	return "0";
        else
        	return a;
    }
    /**
     * Method to increment the number by 1
     */
    public void increment(){
        value++;
        int n=0;
        while(true){
            if(n>=digits.size())
                    digits.add(0,new Digit());
            if(digits.get(n).increment()){
                digits.get(n).value=0;
                n++;
            }else{
                digits.get(n).value++;
                break;
            }
        }
    }
    
    private void convert(){
    	int temp=value;
    	for(int i=0;value!=0;i++){
    		if(i>=digits.size())
    			digits.add(0,new Digit());
    		digits.set(i, new Digit(value%base, base));
        	digits.get(0).increment();
    		value/=base;
    	}
    	value=temp;
    	for(int i=0,j=digits.size()-1;i<j;i++)
    		digits.add(i, digits.remove(j));
    }
 }