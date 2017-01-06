import java.io.*;
import java.util.*;
/**
 * @author Richard Huang
 */
public class Average {
	String fn;
	public Average(String s){
		fn=s;
	}
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
