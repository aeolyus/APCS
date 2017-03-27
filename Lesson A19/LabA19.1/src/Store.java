import java.io.*;
import java.util.*;
public class Store{
    private ArrayList<Item> list=new ArrayList<Item>();
    public Store(String s){
    	loadFile(s);
    }
    public void loadFile(String s){
    	try{
        	Scanner in=new Scanner(new File(s));
        	while(in.hasNext())
        	    list.add(new Item(in.nextInt(),in.nextInt()));
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    /**
     * Sorts the list using merge sort
     */
    public void sort(){
        mergeSort(list,0,list.size()-1);
    }
    public String toString(){
    	String temp="";
        for(int i=0;i<list.size();i++){
        	temp+=String.format("%d   %s\n",i+1,list.get(i).toString());
        	if((i+1)%10==0)
        		temp+="\n";
        }
        return temp;
    }
    public void displayStore(){
    	String s="    Id    Inv\n\n";
    	s+=toString();
    	System.out.println(s);
    }
    public void testSearch(){
    	int id,inv,x;
    	Scanner in=new Scanner(System.in);
    	System.out.println("Testing search algorithm\n");
    	do{
    		System.out.println();
    		System.out.print("Enter Id value to search for (-1 to quit) --> ");
    		id=in.nextInt();
    		if(id!=-1){
    			x=bsearch(new Item(id,0));
    			if(x==-1)
    				System.out.println("Id # "+id+": No such part in stock");
    			else
    				System.out.println("Id # "+id+": Inventory = "+list.get(x).getInv());
    		}
    	}while(id>=0);
    }
    public int bsearch(Item i){
    	int lo=0,hi=list.size()-1;
    	while(lo<=hi){
    		int mid=(lo+hi)/2;
    		if(list.get(mid).compareTo(i)>0)
    			hi=mid+1;
    		else if(list.get(mid).compareTo(i)<0)
    			lo=mid-1;
    		else if(list.get(mid).equals(i))
    			return mid;
    	}
    	return -1;
    }
    /**
	 * Takes in entire vector, but will merge the following sections together:
	 * Left sublist from a[first]..a[mid], right sublist from a[mid+1]..a[last].
	 * Precondition: each sublist is already in ascending order
	 * @param a reference to an array of integers to be sorted
	 * @param first starting index of range of values to be sorted
	 * @param mid midpoint index of range of values to be sorted
	 * @param last last index of range of values to be sorted
	 */
	private void merge(ArrayList<Item> a,int first,int mid,int last){
		ArrayList<Item> temp= new ArrayList<Item>(a.size());
		int i=first,j=mid;
		while(i<mid&&j<=last)
			temp.add(a.get(i).compareTo(a.get(j))>0?(a.get(j++)):(a.get(i++)));
		while(i<mid)
			temp.add(a.get(i++));
		while(j<=last)
			temp.add(a.get(j++));
		for(int o=first;o<=last;o++)
			a.set(o,temp.get(o-first));
	}
	/**
	 * Recursive mergesort of an array of integers
	 * @param a reference to an array of integers to be sorted
	 * @param first starting index of range of values to be sorted
	 * @param last ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList<Item> a,int first,int last){
		if(!(last-first<1)){
			int mid=(last+first)/2;
			mergeSort(a,first,mid);
			mergeSort(a,mid+1,last);
			merge(a,first,mid+1,last);
		}
	}
}