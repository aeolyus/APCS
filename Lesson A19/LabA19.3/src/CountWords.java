import java.io.*;
import java.util.*;
public class CountWords{
    private ArrayList<Word> unique=new ArrayList<Word>();
    private int count=0;
    private String fileName;
    public CountWords(String s){
        loadFile(s);
        fileName=s;
    }
    public void loadFile(String a){
        try{
            Scanner s=new Scanner(new File(a));
            while(s.hasNext()){
                count++;
                String b=s.next().toLowerCase().trim();
                System.out.println(":"+b+":"+bsearch(b));
                if(bsearch(b)>=0)
                    unique.get(bsearch(b)).incrementCount();
                else
                    unique.add(new Word(b));
            }
        }catch(IOException e){
            System.out.println("No such file or directory");
        }
    }
    public void printStats(){
        String temp="File: "+fileName;
        temp+="\nTotal number of unique words in the file: "+unique.size();
        temp+="\nTotal number of words in file: "+count;
        temp+="\nTop 30 words are:\n";
        for(int i=0;i<unique.size();i++)
            temp+=String.format("%2d   %3d   %7s\n",i,unique.get(i).getCount(),unique.get(i).getString());
        System.out.println(temp);
    }
    
    private int bsearch(String s){
    	insertionSort(unique);
        int lo=0,hi=unique.size()-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            System.out.println(s+":"+unique.get(mid).getString());
            if(s.compareTo(unique.get(mid).getString())>0)
                hi=mid-1;
            else if(s.compareTo(unique.get(mid).getString())<0)
                lo=mid+1;
            else if(s.equals(unique.get(mid).getString()))
                return mid;
        }
        return -1;
    }
	public void insertionSort(ArrayList<Word> list){
		for(int o=1;o<list.size();o++){
			int p=o;
			Word k=list.get(p);
			while(p>0&&list.get(p-1).compareTo(k)>0){
				list.set(p,list.get(p-1));
				p--;
			}
			list.set(p,k);
		}
	}
}