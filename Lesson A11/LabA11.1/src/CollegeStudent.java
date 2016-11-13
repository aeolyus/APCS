/**
 * @author Richard Huang
 */
public class CollegeStudent extends Student{
	 private String major;
	 private int year;
	 /**
	  * Constructor for a college student
	  * @param name Name of the college student
	  * @param age Age of the college student
	  * @param gender Gender of the college student
	  * @param idNum ID Number of the college student
	  * @param gpa GPA of the college student
	  * @param year What year of college college student is in
	  * @param major What college student is majoring in
	  */
	 public CollegeStudent(String name,int age,String gender,String idNum,double gpa,int year,String major){
		 super(name,age,gender,idNum,gpa);//from student class which extends form person class
		 this.major=major;
		 this.year=year;
	 }
	 /**
	  * Returns the year of college the college student is in
	  * @return Year of colleee the college student is in
	  */
	 public int getYear(){
		 return year;
	 }
	 /**
	  * Returns the major the college student is pursuing
	  * @return Major of the college student
	  */
	 public String getMajor(){
		 return major;
	 }
	 /**
	  * Sets the year of college the college student is in
	  * @param year Year the college student is in
	  */
	 public void setYear(int year){
		 this.year=year;
	 }
	 /**
	  * Sets the major the college student is pursuing
	  * @param major Major of the college student
	  */
	 public void setMajor(String major){
		 this.major=major;
	 }
	 /**
	  * Returns the college student's name, age, gender, ID number, GPA, year in college, and major as a String
	  * @return Information about the college student
	  */
	 public String toString(){
		 return super.toString()+", year: "+getYear()+", major: "+getMajor();
	}
}
