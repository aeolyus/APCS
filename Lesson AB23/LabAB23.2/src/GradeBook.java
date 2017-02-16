/**
 * @author Richard Huang
 */
public class GradeBook {
	private String courseName;
	private int[][] grades;
	/**
	 * Makes a new gradebook with given course name and array of grades
	 * @param s course name
	 * @param a 2 dimensional array of grades
	 */
	public GradeBook(String s, int[][] a){
		courseName=s;
		grades=a;
	}
	/**
	 * Gets the smallest grade of all the students
	 * @return smallest grade
	 */
	public int getMinimum(){
		int min=100;
		for(int i=0;i<grades.length;i++)
			for(int j=0;j<grades[i].length;j++)
				if(grades[i][j]<min)
					min=grades[i][j];
		return min;
	}
	/**
	 * Gets the largest grade of all the students
	 * @return largest grade
	 */
	public int getMaximum(){
		int max=0;
		for(int i=0;i<grades.length;i++)
			for(int j=0;j<grades[i].length;j++)
				if(grades[i][j]>max)
					max=grades[i][j];
		return max;
		
	}
	/**
	 * Gets the average grade for one student
	 * @param a array of a student's test scores
	 * @return student's average score
	 */
	public double getAverage(int[] a){
		double total=0;
		for(int i=0;i<a.length;i++)
			total+=a[i];
		return total/a.length;
		
	}
	/**
	 * Prints out the grades in the format of a bar chart
	 */
	public void outputBarChart(){
		System.out.println("Overall grade distribution");
		for(int i=0;i<=10;i++){
			if(i==10)
				System.out.print("  100: ");
			else if(i==0)
				System.out.print(i+"0-09: ");
			else
				System.out.print(i+"0-"+(i*10+9)+": ");
			for(int j=0;j<grades.length;j++)
				for(int k=0;k<grades[j].length;k++)
					if(grades[j][k]<=(i*10+9)&&grades[j][k]>=i*10)
						System.out.print("*");
			System.out.println();
		}
	}
	/**
	 * Prints out the grades of each student and their averages in a table format
	 */
	public void outputGrades(){
		System.out.print("The grades are:\n\n                ");
		for(int i=1;i<=grades[0].length;i++)
			System.out.print("Test "+i+" ");
		System.out.println("Average");
		int i;
		for(i=0;i<grades.length;i++){
			System.out.print("Student ");System.out.printf("%2d",i+1);System.out.print("     ");
			for(int j=0;j<grades[i].length;j++){
				System.out.printf("%3d",grades[i][j]);System.out.print("     ");
			}
			System.out.printf("%.2f",getAverage(grades[i]));System.out.println();
		}
	}
	/**
	 * Prints out the minimum and maximum grade of the class, prints out the grades in table format, and prints out a bar chart of the grades
	 */
	public void processGrades(){
		System.out.println("Lowest grade is "+getMinimum());
		System.out.println("Highest grade is "+getMaximum()+"\n");
		outputGrades();
		outputBarChart();
	}
	/**
	 * Sets the name of the course
	 * @param name name of the course
	 */
	public void setCourseName(String name){
		courseName=name;
	}
	/**
	 * Gets the name of the course
	 * @return name of the course
	 */
	public String getCourseName(){
		return courseName;
	}
	/**
	 * Prints out a gradebook welcome message for the course
	 */
	public void displayMessage(){
		System.out.println("Welcome to the gradebook for\n"+courseName+"!\n\n");
	}
}
