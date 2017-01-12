import java.util.*;
/**
 * @author Richard Huang
 */
public class Rolling {
	Random rand;
	/**
	 * constructor to initilize the random number
	 * generator
	 * @param s - seed for the random number generator
	 */
	public Rolling(int s)
	{
		rand = new Random(s);//makes new number generator
	}
	/**
	 * Method to simulate a dice roll
	 * @return an integer between 1 and 6
	 */
    private int roll() 
    { 
        return rand.nextInt(6)+1;
    }
    
    /**  
     * Roll the dice three times and count the
     * number of tries it took to get all three
     * different rolls. In the end print a message
     * displaying the number of tries
     */
    public  void play() {
        int a,b,c,n=0;
        do{
          a=roll();
          b=roll();
          c=roll();
          System.out.println(a+" "+b+" "+c);
          n++;
      }while(a==b||b==c||a==c);//when loop finishes a!=b&&b!=c&&a!=c
      System.out.println("Rolled "+n+" times before all the rolls were different");
        
    }

    /** 
     * when loop finishes, a!=b&&b!=c&&a!=c
     */
  
} 
