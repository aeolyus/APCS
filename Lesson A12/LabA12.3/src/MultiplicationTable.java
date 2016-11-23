/**
 * @author Richard Huang
 */
public class MultiplicationTable{
    /**
     * Method to print the multiplication
     * table for the given number of rows and columns
     * @param nrows - number of rows
     * @param mcols - number of columns
     */
    public static void printTable(int i,int j){
        for(int b=1;b<=i+1;b++){
            if(b==1)
                System.out.print("  ");
            else
                if(b>1)
                    System.out.printf("%2d",b-1);
                else
                    System.out.printf("%2d",b);
            for(int a=1;a<=j;a++){
                if(b>1)
                    System.out.printf("%7d",a*(b-1));
                else
                    System.out.printf("%7d",a*b);
            }
                if(b==1)
                    System.out.println();
            System.out.println();
        }
    }
    public static void main(String args[]){
        printTable(4,6);
    }
}