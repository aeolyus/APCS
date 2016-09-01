/**
 * @author Richard Huang
 */
public class Car{
	
	//initializes privant variable instances
	private int startOdometer;
	private int currentOdometer;
	private double gallonsConsumed;
	
	//constructor that sets argument as starting odometer value
	public Car(int start){
		startOdometer=start;
	}

	//method to set current odometer and gallons consumed to current value
	public void fillUp(int current, double gallonsUsed){
		currentOdometer=current;
		gallonsConsumed=gallonsUsed;
	}

	//method to calculate MPG based on current odometer, start odometer, and gallons consumed
	public double calculateMPG(){
		double MPG = (double)(currentOdometer-startOdometer)/gallonsConsumed;
		return MPG;
	}

	//sets gallons consumed to 0 and sets the starting odometer as the current odometer value
	public void resetMPG(){
		startOdometer=currentOdometer;
		gallonsConsumed=0;
	}
}