/**
 * @author Richard Huang
 */
public class Teacher extends Person{
	private double salary;
	private String subject;
	/**
	 * Constructor for a teacher
	 * @param name Name of the teacher
	 * @param age Age of the teacher
	 * @param gender Gender fo the teacher
	 * @param subject Subject teacher teaches
	 * @param salary How much they make a year
	 */
	public Teacher(String name,int age,String gender,String subject,int salary){
		super(name,age,gender);//from person class
		this.salary=salary;
		this.subject=subject;
	}
	/**
	 * Returns the subject teacher teaches
	 * @return Subject the teacher teaches
	 */
	public String getSubject(){
		return subject;
	}
	/**
	 * Returns the annual salary of the teacher
	 * @return Annual salary of the teacher
	 */
	public double getSalary(){
		return salary;
	}
	/**
	 * Sets the subject of the teacher
	 * @param subject Subject teacher teaches
	 */
	public void setSubject(String subject){
		this.subject=subject;
	}
	/**
	 * Sets the annual salary of the teacher
	 * @param salary Annual salary of the teacher
	 */
	public void setSalary(int salary){
		this.salary=salary;
	}
	/**
	 * Returns the teacher's name, age, gender, subject he teaches, and annual salary as a String
	 * @return Information about the teacher
	 */
	public String toString(){
		return super.toString()+", subject: "+getSubject()+", salary: "+getSalary();
	}
}
