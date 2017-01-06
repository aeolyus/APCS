import java.io.*;
import java.util.*;
/**
 * @author Richard Huang
 */
public class Average {
	String fn;//filename
	/**
	 * Constructor intitializes given file name to the filename var
	 * @param s file name
	 */
	public Average(String s){
		fn=s;
	}
	/**
	 * Scans the file and calculates the average of all the numbers
	 * @return average of the numbers in the file
	 */
	public double scanDataAndCalculateAverage(){
		try{
			int c=0,n=0;
			Scanner in=new Scanner(new File(fn));
			if(!in.hasNext())throw new NullPointerException(fn+" is empty");
			if(!in.hasNextInt())throw new IllegalArgumentException(fn+" does not have numeric data");
			while(in.hasNextInt()){
				n+=in.nextInt();
				c++;
			}return (double)n/c;
		}catch(IOException i){System.out.println("Error: "+fn+" (No such file or directory)");}
		return 0;
	}
}
