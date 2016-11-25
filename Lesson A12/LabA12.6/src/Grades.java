import java.util.Scanner;
/**
 * @author Richard Huang
 */
public class Grades{
    private int grade=1,count=0;
    private double gpa;
    private Scanner in = new Scanner(System.in);
	/**
	 * Method to get the grades and calculate the GPA
	 * This method also counts the number of classes taken
	 * and the number of Fs
	 */
    public void getGradesAndCalculateGPA(){
    	grade=1;
    	count=0;
    	gpa=0;
    	System.out.print("Enter your grades: ");
    	char s=97;
    	while(s!=101&&(s>=97&&s<=102)){
        	s=in.next().toLowerCase().charAt(0);
        	if(s!=101&&(s>=97&&s<=102)){
        		if(s==102)//if its an F grade
        			grade=-1;
        		else
        			gpa+=101-s;
        		count++;
        	}
        }
        gpa=Math.round(gpa/((double)count)*100)/100.0;
    }
	/**
	 * Method to print the appropriate message
	 */
    public void printMessage(){
    	System.out.println("GPA = "+gpa);
    	if(grade>0&&gpa>=2&&count>=4)
            System.out.println("Eligible");
        else if(count<4)
            System.out.println("Ineligible, taking less than 4 classes");
        else if(gpa<2&&grade>0)
        	System.out.println("Ineligible, gpa below 2.0");
        else if((grade<0)&&gpa>=2)
        	System.out.println("Ineligible, gpa above 2.0 but has F grade");
        else if((grade<0)&&gpa<2)
        	System.out.println("Ineligible, gpa below 2.0 and has F grade");
    }
}