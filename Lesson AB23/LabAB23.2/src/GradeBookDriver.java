import java.io.File;
import java.util.Scanner;
/**
 * 
 * @author Your name
 * @period #
 *
 */

public class GradeBookDriver 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int maxCols = 3;
		

		int[][] gradesArray = new int[20][3];
		try{
			Scanner sc = new Scanner(new File("grades.txt"));
			int maxRows = sc.nextInt();
			for (int i = 0; i < maxRows; i++)
				for (int j = 0; j < maxCols; j++)
					gradesArray[i][j] = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		GradeBook myGradeBook = new GradeBook("APCS - AP Computer Science", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
	}// end main

}// end class