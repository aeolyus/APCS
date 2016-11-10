
public class Teacher extends Person{
	private double salary;
	private String subject;
	public Teacher(String name,int age,String gender,int salary,String subject){
		super(name,age,gender);
		this.salary=salary;
		this.subject=subject;
	}
	public String getSubject(){return subject;}
	public double getSalary(){return salary;}
	public void setSubject(String subject){this.subject=subject;}
	public void setSalary(int salary){this.salary=salary;}
	public String toString(){
		return super.toString()+", subject: "+getSubject()+", salary: "+getSalary();
	}
}
