
public class CollegeStudent extends Student{
	 private String major;
	 private int year;
	public CollegeStudent(String name,int age,String gender,String idNum,double gpa,String major,int year){
		super(name,age,gender,idNum,gpa);
		this.major=major;
		this.year=year;
	}
	public int getYear(){return year;}
	public String getMajor(){return major;}
	public void setYear(int year){this.year=year;}
	public void setMajor(String major){this.major=major;}
	public String toString(){
		return super.toString()+", year: "+getYear()+", major: "+getMajor();
	}
}
