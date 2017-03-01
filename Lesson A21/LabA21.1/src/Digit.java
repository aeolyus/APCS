public class Digit{
    int base,value;
    /**
     * Default constructor to initialize the value
     * to zero and base to 10
     */
    public Digit(){
        base=10;
        value=0;
    }
    /**
     * Constructor to initialize the value and 
     * base of this Digit to the given values
     * @param val initial value
     * @param b base
     */
    public Digit(int v, int b){ 
      	base=b;
      	value=v;
    }
    /**
     * Method to return the digit as a string for
     * printing
     */
    public String toString(){
        if(value<10||base<=10){
            String temp="";
            temp+=value;
            return temp;
        }else{
            int a='A'+value-10;
            String c="";
            c+=(char)a;
            return c;
        }
    }
    /**
     * Method to increment the digit by 1
     * @return true if there is carry, false otherwise
     */
    public boolean increment(){
	    if(value+1>=base)
	        return true;
        return false;
    }
}