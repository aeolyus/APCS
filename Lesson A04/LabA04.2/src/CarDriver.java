/**
 * @author Richard Huang
 */
import java.util.Scanner;
public class CarDriver{
	public static void main(String args[]){
		//initialize user input
		Scanner in = new Scanner(System.in);
		
		//initializes myCar object with user inputted int as odometer value 
		System.out.print("New car odometer reading: ");
		int newOdometer = in.nextInt();
		Car myCar = new Car(newOdometer);
		
		//fillUp method called with user inputted values
		System.out.print("Filling Station Visit:\nodometer reading: ");
		int odometerReading = in.nextInt();
		System.out.print("gallons to fill tank: ");
		double gallonsFill = in.nextDouble();
		myCar.fillUp(odometerReading,gallonsFill);
		System.out.println();
	
		//calculates and prints out the MPG of myCar based on previous user input
		System.out.printf("Miles per gallon: %.2f\n\n",myCar.calculateMPG());
		
		myCar.resetMPG();
		
		//second run
		//fillUp method called with user inputted values
		System.out.print("Filling Station Visit:\nodometer reading: ");
		odometerReading = in.nextInt();
		System.out.print("gallons to fill tank: ");
		gallonsFill = in.nextDouble();
		myCar.fillUp(odometerReading,gallonsFill);
		System.out.println();
	
		//calculates and prints out the MPG of myCar based on previous user input
		System.out.printf("Miles per gallon: %.2f",myCar.calculateMPG());
		
		myCar.resetMPG();
		
		
	}
}