/**
 * @author: Richard Huang
 */
 import java.util.Scanner;//import Scanner
 public class Elevator{
     Scanner stdin = new Scanner(System.in);//makes new Scanner stdin
     private final int MAX_FLOORS=20;//sets the max floors in the building to 20
     
     /**
      * Simulates an elevator in a bulding with MAX_FLOORS amount of floors and only accepts integer floor numbers between 0 and the maximum amount of floors and not 13 since floor 13 doesn't exist which is kind of creepy
      */
     public void simulate(){
    	 System.out.print("Floor: ");//formatting
         if(stdin.hasNextInt()){//chckes if the inputted value will be an integer
        	 int floor = stdin.nextInt();
             if(floor<=MAX_FLOORS&&floor>0){//checks if input is within range
                 if(floor!=13){//checks if input is 13 (because floor 13 doesn't exist)
                	 if(floor<13){//if input is more than 13 subtract 1 from floor sicne floor 13 doesn't exist
                	 	System.out.println("Thank you, I will take you to the actual floor "+floor);//if input is below 13
                	 }else{
                		 System.out.println("Thank you, I will take you to the actual floor "+(floor-1));//if input is above 13
                	 }
                 } else{
                     System.out.println("Error: There is no thirteenth floor");//input was 13
                 }
             } else{
                 System.out.println("Error: The floor must be between 1 and 20");//input was out of range
             }
         } else {
             System.out.println("Error: Not an integer");//input was not an integer
         }
     }
     
 }