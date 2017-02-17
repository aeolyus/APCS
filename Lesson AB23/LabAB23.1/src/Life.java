import java.io.*;
import java.util.Scanner;
/**
 * @author Richard Huang
 */
public class Life{
	private char[][] arr=new char[20][20];
	private int living;
	/** constructor
	 * reads in the data from the given file and sets up the 
	 * life matrix
	 * @param fname - name of file
	 */
	public Life(String fname){
	    try{
	    	Scanner in=new Scanner(new File(fname));
		    living=in.nextInt();
		    while(in.hasNext())
		        arr[in.nextInt()-1][in.nextInt()-1]='*';
        }catch(IOException e){
            e.printStackTrace(System.out);
        }
	}
	/**
	 * method to print the life matrix
	 */
	public void printMatrix(){
        System.out.println("     12345678901234567890\n");
        for(int i=0;i<arr.length;i++){
        	System.out.printf("%-2d",i+1);System.out.print("     ");
        	for(int j=0;j<arr[i].length;j++){
        		if(!isEmpty(arr,i,j))
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        }
	}
	
	/**
	 * Method to count the number of neighbors of the given cell
	 * in the life matrix
	 * @param row - row number
	 * @param col - column number
	 * @return - number of neighbors of the given cell
	 */
	public int numberOfNeighbors(int row, int col){
		char[][] temp=new char[22][22];//ring 0's
		for(int i=0;i<temp.length;i++)
			temp[0][i]=temp[21][i]=temp[i][0]=temp[0][21]=0;
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				temp[i+1][j+1]=arr[i][j];
		
		int x=-1;
		for(int i=row;i<2;i++)
		    for(int j=col;j<2;j++)
		        if(temp[i][j]!=0)
		            x++;
		return x;
	}
	/**
	 * method to determine if given cell is empty
	 * @param row - cell row number
	 * @param col - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(char[][] mat, int row, int col){
		if(mat[row][col]==0)
		    return true;
	    return false;
	}
	
	/** 
	 * method that simulates the game of life
	 */
	public void generation(){
	    char[][] tarr=arr;
        for(int g=0;g<5;g++){
            for(int i=0;i<arr.length;i++)
                for(int j=0;j<arr[i].length;j++){
                    if(!isEmpty(arr,i,j)&&numberOfNeighbors(i,j)<2&&numberOfNeighbors(i,j)>3){
                        tarr[i][j]=0;
                        living--;
                    }else if(isEmpty(arr,i,j)&&numberOfNeighbors(i,j)==3){
                        tarr[i][j]='*';
                        living++;
                    }
                }
        }
        arr=tarr;
        
	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics(){
	    int r=0,c=0;
	    for(int i=0;i<arr.length;i++)
	        if(arr[9][i]=='*')
	            r++;
        for(int i=0;i<arr.length;i++)
	        if(arr[i][9]=='*')
	            c++;
        System.out.println("Number in Row 10 ---> "+r);
        System.out.println("Number in Column 10 ---> "+c);
        System.out.println("Number of living organisms ---> "+living);
	}
}
