import java.util.*;
import java.io.*;
/**
 * Chapter AB23 - Two-Dimensional Arrays Exercises
 * @author Richard Huang
 */
public class MatrixManipulator{
    Scanner scan;
    /**
     * Constructs a new MatrixManipulator and instantiates a scanner
     */
    public MatrixManipulator(){
        scan=new Scanner(System.in);
    }
    /**
     * Returns the sume of all the elements in the array
     * @param data 2 dimensional array
     * @return sum of elements in array
     */
    public int sumOfAllArrayElements(int[][] data){
        int sum=0;
        for(int i=0;i<data.length;i++)
            for(int j=0;j<data[i].length;j++)
                sum+=data[i][j];
        return sum;
    }
    /**
     * Returns an array containing the sum of each row
     * @param data 2 dimensional array
     * @return array containing sum of each row
     */
    public int[] sumOfEachRow(int[][] data){
        int[] rowSums=new int[data.length];
        for(int k=0;k<data.length;k++)
            for(int i=0;i<data[k].length;i++)
                rowSums[k]+=data[k][i];
        return rowSums;
    }
    /**
     * Returns an array containing the sum of each column
     * @param data 2 dimensional array
     * @return array containing sum of each column
     */
    public int[] sumOfEachColumn(int[][] data){
        int a=0;
        for(int i=0;i<data.length;i++)//find the largest column
            if(data[i].length>a)
                a=data[i].length;
        int[] colSums=new int[a];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++)
                colSums[j]+=data[i][j];
        }
        return colSums;
    }

    /**
     * Check if the array is a magic square. This means that it must be square, and that all row sums, all column sums, and the two diagonal-sums must all be equal.
     * @param data 2 dimensional array
     * @return boolean on whether the array is a magic square
     */
    public boolean isMagic(int[][] data){
        for(int i=0;i<data.length-1;i++)
            if(sumOfEachRow(data)[i]!=sumOfEachRow(data)[i+1])
                return false;
        for(int i=0;i<data.length-1;i++)
            if(sumOfEachColumn(data)[i]!=sumOfEachColumn(data)[i+1])
                return false;        
    	return true;
    }
    /**
     * Returns an array with the max and min elements in the array
     * @param data 2 dimensional array
     * @return	array containing max and min elements respectively
     */
    public int[] maxAndMinElements(int[][] data){
        int max=0,min=0;
        for(int i=0;i<data.length;i++)
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]>max)
                    max=data[i][j];
                else if(data[i][j]<min)
                    min=data[i][j];
            }
        int[] result = {max,min};
        return result;
    }
    /**
     * Returns the largest element in the array
     * @param data 2 dimensional array
     * @return largest element in the array
     */
    public int[] largestElements(int[][] data){
        int[] largestInRow = new int[data.length];
        for(int i=0;i<data.length;i++){
            int temp=0;
            for(int j=0;j<data[i].length;j++)
                if(data[i][j]>temp)
                    temp=data[i][j];
            largestInRow[i]=temp;
        }
        return largestInRow;
    }
    /**
     * Reverses the elements in each row of an array and prints them out
     * @param data 2 dimensional array
     */
    public void reversalOfElementsInEachRow(int[][] data){
    	for(int i=0;i<data.length;i++)
            for(int j=0;j<data[i].length/2;j++){
                int temp=data[i][j];
                data[i][j]=data[i][data[i].length-j-1];
                data[i][data[i].length-j-1]=temp;
            }
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++)
                System.out.print(data[i][j]+" ");
            System.out.println();
        }

    }
    /**
     * Smooths over the image by finding the average of the 8 elements around each element
     * @param image 2 dimensional array containing grayscale values of an image
     * @return smoothed over image array
     */
    public int[][] imageSmootherEasy(int[][] image){
        int[][] smooth = new int[image.length][image[0].length];
        int temp=0;
        for(int i=1;i<image.length-1;i++)
            for(int j=1;j<image[i].length-1;j++){
                temp=(image[i-1][j-1]+image[i-1][j]+image[i-1][j+1]+image[i][j-1]+image[i][j]+image[i][j+1]+image[i+1][j-1]+image[i+1][j]+image[i+1][j+1]) / 9;
                smooth[i][j]= temp;
            }
        return smooth;
    }
    /**
     * Smooths over the image (including the edges) by finding the average of the 8 elements around each element
     * @param image 2 dimensional array containing grayscale values of an image
     * @return smoothed over image array
     */
    public int[][] imageSmootherHard(int[][] image){
        int[][] smooth = new int[image.length+2][image[0].length+2];//ring 0's
        for(int i=0;i<smooth.length;i++)
            smooth[0][i]=smooth[smooth.length-1][i]=smooth[i][0]=smooth[i][smooth[0].length-1]=0;
        for(int i=0;i<image.length;i++)
            for(int j=0;j<image[i].length;j++)
                smooth[i+1][j+1]=image[i][j];
        smooth=imageSmootherEasy(smooth);
        int[][] arr=new int[image.length][image[0].length];//no ring 0's
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j]=smooth[i+1][j+1];
        return arr;
    }
}