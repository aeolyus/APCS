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
	String inFile, outFile;
	int maxLineLength;
	/**
	 * Initializes the input and output files and the max
	 * characters per line
	 * @param in - name of input file
	 * @param out - name of output file
	 * @param max - max characters per line (including spaces)
	 */
	public StopWordRemover(String in, String out, int max){
		inFile=in;
		outFile=out;
		maxLineLength=max;
	}
	/**
	 * Removes the stop words and outputs the text to a file
	 * Each line of output is not more than max characters long
	 * @return the number of words removed
	 */
	public int removeStopWords(){
		try{
			int count=0;
			Scanner stop=new Scanner(stopList);
			FileWriter f=new FileWriter(outFile);
			while(stop.hasNext()){
				String temp=stop.next();
				Scanner in=new Scanner(new File(inFile));
				while(in.hasNext()){
					String word=in.next();
					if(temp==word)
						count++;
					else
						f.write(word+" ",0,+word.length()+1);
				}
			}
			f.close();
			return count;
		}catch(IOException i){
			System.out.println(i.getMessage());
			return 0;
		}
	}
}
