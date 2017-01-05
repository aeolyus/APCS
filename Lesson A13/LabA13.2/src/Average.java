import java.io.*;
import java.util.*;
/**
 * @author Richard Huang
 */
public class Average {
	String fileName;
	public Average(String s){
		fileName=s;
	}
	public void scanDataAndCalculateAverage(){
		try{
			Scanner in=new Scanner(new File(fileName));
			try{
				if(!in.hasNextLine())throw new IllegalArgumentException("File is empty");
				try{
					int i=0,c=0;
					while(in.hasNextLine()){
						i+=Integer.valueOf(in.nextLine());
						c++;
					}
					System.out.println("Average: "+(double)i/c);
				}catch(NumberFormatException n){
					System.out.println(fileName+" does not have numeric data");
				}
			}catch(IllegalArgumentException e){
			}
			in.close();
		}catch(IOException i){
			System.out.println("Error: "+fileName+"(The system cannot find the file specified");
		}
	}
}
