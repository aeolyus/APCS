import java.io.*;
import java.util.*;
public class CountWords{
    private ArrayList<Word> unique=new ArrayList<Word>();
    private int count=0;
    private String fileName;
    public CountWords(String s){
        loadFile(s);
    }
    public void loadFile(String a){
        fileName=a;
        try{
            Scanner s=new Scanner(new File(a));
            while(s.hasNext()){
                count++;
                int t=0;
                String b=s.next();
                if(check(b)==0)
                    unique.get(t++).incrementCount();
                else
                    unique.add(new Word(b));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public String printStats(){
        String temp="File: "+fileName;
        temp+="\nTotal number of unique words in the file: "+unique.size();
        temp+="\nTotal numer of words in file: "+count;
        temp+="\nTop 30 words are:\n";
        for(int i=0;i<unique.size();i++)
            temp+=i+1+"   "+unique.get(i).getCount()+"   "+unique.get(i).getString()+"\n";
        return temp;
    }
    
    private int check(String s){
        int l=0,h=unique.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(s.compareTo(unique.get(mid).getString())>0)
                l=mid+1;
            else if(s.compareTo(unique.get(mid).getString())<0)
                h=mid-1;
            else return mid;
        }
        return -1;
    }
}