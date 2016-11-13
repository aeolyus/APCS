/**
 * @author Richard Huang
 */
public class HoomanDriver {
	public static void main(String args[]){
		Teacher teach=new Teacher("Teach",12,"M","Math",2000);
		System.out.println(teach.toString());
		CollegeStudent stud=new CollegeStudent("Frosh",18,"F","UCB123",4,2,"Mathematics");
		System.out.println(stud.toString());
	}
}
