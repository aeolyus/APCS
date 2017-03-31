import java.io.*;
import java.util.*;
/**
 * @author Richard Huang
 */
public class CountWords{
	private ArrayList<Word> unique=new ArrayList<Word>();
	private int count=0;
	private String fileName;
	private boolean exists=true;
	/**
	 * Initializes the countwords with the filename
	 * @param s file name
	 */
	public CountWords(String s){
		loadFile(s);
		fileName=s;
	}
	/**
	 * Loads data from the file
	 * @param a file name
	 */
	public void loadFile(String a){
		try{
			Scanner s=new Scanner(new File(a));
			while (s.hasNext()){
				String temp=trim(s.next().toLowerCase().trim());
				if (temp.equals(""))
					continue;
				else{
					count++;
					Word b=new Word(temp);
					insertionSort(unique,0);
					if (check(b,0,unique.size()-1)>=0)
						unique.get(check(b,0,unique.size()-1)).incrementCount();
					else
						unique.add(b);
				}
			}
		}catch (IOException e){
			exists=false;
		}
	}
	/**
	 * Trims the word down to the valid characters only
	 * @param s string to be trimmed
	 * @return trimmed string
	 */
	private String trim(String s){
		if (s.length()==0){
			return "";
		}else if (!allow(s.toLowerCase().charAt(0))){
			return trim(s.substring(1));
		}else if (!allow(s.toLowerCase().charAt(s.length()-1))){
			return trim(s.substring(0,s.length()-1));
		}else{
			return s;
		}
	}
	/**
	 * Checks to see if a character is valid
	 * @param a character to check
	 * @return whether the character is valid or not
	 */
	private boolean allow(char a){
		if ((a>='a'&&a<='z')||(a>='0'&&a<='9')||a=='\'')
			return true;
		return false;
	}
	/**
	 * Checks if the word already exists in the list
	 * @param w Word to check
	 * @param first first index
	 * @param last last index
	 * @return index of the word (-1 if it doesn't exist)
	 */
	private int check(Word w,int first,int last){
		if (unique.size()==0){
			return -1;
		}
		int index=(last+first)/2;
		if (unique.get(index).compareTo(w)!=0&&first==last){
			return -1;
		}else if (last-first==1){
			if (unique.get(first).compareTo(w)==0){
				return first;
			}else if (unique.get(last).compareTo(w)==0){
				return last;
			}else
				return -1;
		}else if (unique.get(index).compareTo(w)==0){
			return index;
		}else if (unique.get(index).compareTo(w)>0){
			return check(w,first,index);
		}else{
			return check(w,index,last);
		}
	}
	/**
	 * Sorts the given list using insertion sort
	 * @param list list to sort
	 * @param mode 0=sort alphabetically, 1=sort by the count number
	 */
	public void insertionSort(ArrayList<Word> list,int mode){
		if (mode==0)
			for (int o=1; o<list.size(); o++){
				int p=o;
				Word k=list.get(p);
				while (p>0&&list.get(p-1).compareTo(k)>0){
					list.set(p,list.get(p-1));
					p--;
				}
				list.set(p,k);
			}
		else if (mode==1)
			for (int o=1; o<list.size(); o++){
				int p=o;
				Word k=list.get(p);
				while (p>0&&list.get(p-1).getCount()<k.getCount()){
					list.set(p,list.get(p-1));
					p--;
				}
				list.set(p,k);
			}
	}
	/**
	 * Prints the stats of the list
	 */
	public void printStats(){
		if (unique.size()>30)
			insertionSort(unique,1);
		else
			insertionSort(unique,0);
		String temp="File: "+fileName;
		if (!exists)
			temp+="\nError: "+fileName+" (No such file or directory)";
		temp+="\nTotal number of unique words used in the file: "+unique.size();
		temp+="\nTotal number of words in file: "+count;
		temp+="\nTop 30 words are:\n";
		for (int i=0; i<unique.size()&&i<30; i++)
			temp+=String.format("%2d   %3d   %7s\n",i,unique.get(i).getCount(),
					unique.get(i).getString());
		System.out.print(temp);
	}
}