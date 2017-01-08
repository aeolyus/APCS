import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**
 * @author Richard Huang
 */
public class StopWordRemover {
	String stopList = "a an the for of at on in to her she him his he her's and with was is";
	String iF, oF;
	int maxl,count;
	/**
	 * Initializes the input and output files and the max
	 * characters per line
	 * @param in - name of input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max){
		iF=in;
		oF=out;
		maxl=max;
		count=0;
	}
	/**
	 * Removes the stop words and outpuths the text to a file
	 * Each line of output is not more than max characters long
	 * @return the number of words removed
	 */
	public int removeStopWords(){
		try{//check if file exists
			String temp="";
			Scanner in=new Scanner(new File(iF));
			while(in.hasNextLine())
				temp+=in.nextLine()+" ";
			try{//check if file is empty
				if(temp.equals(""))throw new NoSuchElementException();
				String temp2=remove(temp.trim());
				String toWrite="";
				in=new Scanner(temp2);
				int i=0;
				while(in.hasNext()){//format length
					String s=in.next();
					if(i+s.length()+1>maxl){
						toWrite=toWrite.trim()+"\n"+s+" ";
						i=s.length()+1;
					}else{
						toWrite+=s+" ";
						i+=s.length()+1;
					}
				}
				FileWriter f=new FileWriter(oF);//write to output file
				f.write(toWrite.trim());//remove the extra space
				f.close();
				return count;
			}catch(NoSuchElementException e){
				System.out.println("Error: "+iF+" is empty");
			}
		}catch(IOException i){
			System.out.println("Error: "+i.getMessage());
		}
		return 0;
	}
	/**
	 * Helps remove words in the stopList String from the inputted String
	 * @param s Input String
	 * @return String without words in the stopList String
	 */
	private String remove(String s){
		Scanner in=new Scanner(stopList);
		while(in.hasNext()){//checks for the first word
			String check=in.next()+" ";
			check=check.toUpperCase().charAt(0)+check.substring(1);
			if(s.contains(check)){
				count++;
				s=s.substring(0,s.indexOf(check))+s.substring(s.indexOf(check)+check.length()-1);
			}
		}
		in=new Scanner(stopList);//reset
		while(in.hasNext()){//only checks for words in the middle that match
			String check=" "+in.next()+" ";
			if(s.toLowerCase().contains(check)){
				count++;
				s=s.substring(0,s.toLowerCase().indexOf(check))+s.substring(s.toLowerCase().indexOf(check)+check.length()-1);
				s=remove(s);
			}
		}
		return s;
	}
}