
public class HoomanDriver {
	public static void main(String args[]){
		Teacher teach=new Teacher("Teach",12,"M",2000,"Math");
		System.out.println(teach.toString());
		CollegeStudent stud=new CollegeStudent("Frosh",18,"F","UCB123",4,"Mathematics",2);
		System.out.println(stud.toString());
	}
}
