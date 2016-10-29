import java.util.Scanner;

/**
 * @author Richard Huang
 */
public class CarRentalDriver {
	static Scanner in = new Scanner(System.in);
	
	/**
	 * Simplifies creating a CarRental object along with input and output into one method
	 */
	public static void hassle(){
		System.out.print("Make: ");
		String make=in.nextLine();
		
		System.out.print("Model: ");
		String model=in.nextLine();
		
		System.out.print("License Plate: ");
		String lic=in.nextLine();
		
		CarRental c = new CarRental(make,model,lic);
		System.out.println(c.toString());
	}
	
	/**
	 * Prompts the user three times
	 * @param args Needed in main method
	 */
	public static void main(String args[]){
		hassle();
		hassle();
		hassle();
	}
}
