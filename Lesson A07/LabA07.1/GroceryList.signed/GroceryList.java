import java.util.Scanner;
/**
 * @author Richard Huang
 * period 1
*/
public class GroceryList{
	//initializes scanner object in and double total
	Scanner in = new Scanner(System.in);
	private double total;
	
	//default constructor
	public GroceryList(){
	}
	
	//calculate method
	public void calculate(){
		//input grocery item prices
		System.out.print("Enter item#1: ");
		double item1=in.nextDouble();
		System.out.print("Enter item#2: ");
		double item2=in.nextDouble();
		System.out.print("Enter item#3: ");
		double item3=in.nextDouble();
		System.out.print("Enter item#4: ");
		double item4=in.nextDouble();
		System.out.print("Enter item#5: ");
		double item5=in.nextDouble();
		
		//print column titles
		System.out.printf("%10s%10s%10s","item:", "cost:", "total:");
		System.out.println();
		
		//print item number, price, and total value of all current items
		total+=item1;
		System.out.printf("%10s%10.2f%10.2f","#1", item1, total);
		System.out.println();
		total+=item2;
		System.out.printf("%10s%10.2f%10.2f","#2", item2, total);
		System.out.println();
		total+=item3;
		System.out.printf("%10s%10.2f%10.2f","#3", item3, total);
		System.out.println();
		total+=item4;
		System.out.printf("%10s%10.2f%10.2f","#4", item4, total);
		System.out.println();
		total+=item5;
		System.out.printf("%10s%10.2f%10.2f","#5", item5, total);
		}	
}
