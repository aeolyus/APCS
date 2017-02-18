import java.io.File;
import java.util.Scanner;
/**
 * @author Richard Huang
 */
public class Life{
	private int[][] arr=new int[20][20];
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
				arr[in.nextInt()-1][in.nextInt()-1]=1;
		}catch(Exception e){
			e.printStackTrace();
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
		int[][] temp=new int[22][22];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length;j++)
				temp[i+1][j+1]=arr[i][j];
		row++;col++;
		int x=temp[row-1][col-1]+temp[row-1][col]+temp[row-1][col+1]+temp[row][col-1]+temp[row][col+1]+temp[row+1][col-1]+temp[row+1][col]+temp[row+1][col+1];
		return x;

	}
	/**
	 * method to determine if given cell is empty
	 * @param row - cell row number
	 * @param col - cell column number
	 * @return true if it is empty, false otherwise
	 */
	private boolean isEmpty(int[][] mat, int row, int col){
		if(mat[row][col]==1)
			return false;
		return true;
	}
	
	/** 
	 * method that simulates the game of life
	 */
	public void generation(){
		int[][] temp=new int[20][20];
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++){
				if(!isEmpty(arr,i,j)&&(numberOfNeighbors(i,j)<2||numberOfNeighbors(i,j)>3)){
					temp[i][j]=0;
					living--;
				}else if(isEmpty(arr,i,j)&&numberOfNeighbors(i,j)==3){
					temp[i][j]=1;
					living++;
				}else
					temp[i][j]=arr[i][j];
			}
		arr=temp;
	}
	
	/**
	 * Method to print the statistics
	 */
	public void printStatistics(){
		int r=0,c=0;
	    for(int i=0;i<arr.length;i++)
	        if(arr[9][i]==1)
	            r++;
        for(int i=0;i<arr.length;i++)
	        if(arr[i][9]==1)
	            c++;
        System.out.println("Number in Row 10 ---> "+r);
        System.out.println("Number in Column 10 ---> "+c);
        System.out.println("Number of living organisms ---> "+living);
		
	}
}
