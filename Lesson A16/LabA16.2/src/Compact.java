import java.util.*;
import java.io.*;
/**
 * @author Richard Huang
 */
public class Compact{
    private String fileName;
    private String temp="";
    private int size=0;
    /**
     * Creates a compact object
     * @param s name of the file to be compacted
     */
    public Compact(String s){
        fileName=s;
    }
    
    /**
     * Compacts the input by taking out all the zeroes
     */
    public void compactIt(){
        try{
            Scanner in=new Scanner(new File(fileName));
            while(in.hasNextInt()){
                temp+=in.nextInt()+" ";
                size++;
            }
            int[] arr=new int[size];
            int k=0;
            Scanner p=new Scanner(temp);
            while(p.hasNextInt()){
                int i=p.nextInt();
                if(i!=0)
                    arr[k++]=i;
            }
            String s="Before: "+temp+"\nAfter: ";
            for(int n:arr)
                s+=n+" ";
            s=s.substring(0,s.length()-1);
            System.out.println(s);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}