public class Student extends Person{
  private String myIdNum; // Student Id Number
  private double myGPA; // grade point average

  /**
   * Constructor
   * @param name - student's name
   * @param age - student's age
   * @param gender - student's gender
   * @param idNum - student's id
   * @param gpa - student's gpa
   */
  public Student(String name, int age, String gender,
                                String idNum, double gpa){
    // use the super class' constructor
    super(name, age, gender);

    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
  }
  /**
   * Method to get the student's ID
   * @return - student's ID
   */
  public String getIdNum(){
    return myIdNum;
  }
  /**
   * Method to get the student's gpa
   * @return - student's gpa
   */
  public double getGPA(){
    return myGPA;
  }
  /**
   * Method to set the student's ID
   * @param idNum - student's ID
   */
  public void setIdNum(String idNum){
    myIdNum = idNum;
  }
  /**
   * Method to set the student's GPA
   * @param gpa - student's GPA
   */
  public void setGPA(double gpa){
    myGPA = gpa;
  }
  /**
   * Method to create a string with the student's information
   * @return string with student's information
   */
  public String toString()
  {
	  return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
  }
}