import java.util.*;
/**
 * @author Richard Huang
 */
public class School{
    Student[] list;
    private int c;//student count
    /**
     * Initializes a new school with a capacity of 10 students
     */
    public School(){
        list=new Student[10];
        c=0;
    } 
    /**
     * Adds a student object to the array of students
     * @param s student to be added to the array of students 
     */
    public void add(Student s){
        for(int i=c;i<list.length-2;i++)
            list[i+1]=list[i+2];
        list[c++]=s;
    }
    /**
     * Adds a new student with given name and test scores
     * @param s student name
     * @param a student test scores
     */
    public void add(String s,int[] a){
        for(int i=c;i<list.length-2;i++)
            list[i+1]=list[i+2];
        list[c++]=new Student(s,a);
    }
    /**
     * Adds a new student with given name
     * @param s student name
     */
    public void add(String s){
        for(int i=c;i<list.length-2;i++)
            list[i+1]=list[i+2];
        list[c++]=new Student(s);
    }
    /**
     * Adds a new blank student
     */
    public void add(){
        for(int i=c;i<list.length-2;i++)
            list[i+1]=list[i+2];
        list[c++]=new Student();
    }
    /**
     * Removes the student from the list
     * @param s student to be removed
     */
    public void remove(Student s){
        for(int i=0;i<c+1;i++){
            if(list[i]==s){
                for(int n=i;n<list.length-2;n++)
                    list[n]=list[n+1];       
            }
            list[list.length-1]=null;
        }
        c--;
    }
    /**
     * Remove student at given index
     * @param i index of student to be removed
     */
    public void remove(int i){
        for(int j=i;j<c;j++)
            list[j]=list[j+1];
        list[list.length-1]=null;
        c--;
    }
    /**
     * Removes student with given name
     * @param s name of student to be removed
     */
    public void remove(String s){
        for(int i=0;i<c-1;i++){
            if(list[i].getName()==s){
                for(int n=i;n<list.length-2;n++)
                    list[n]=list[n+1];
                list[list.length-1]=null;
            }
        }
        c--;
    }
    /**
     * Replaces the student at the given index
     * @param i index of student to be placed
     * @param s student to replace the old student
     */
    public void replace(int i, Student s){
        list[i]=s;
    }
    /**
     * Gets the student with the highest score
     * @return student with the highest score
     */
    public Student getHighScore(){
        Student high=new Student();
        for(int i=0;i<c;i++)
            if(list[i].getHighScore()>high.getHighScore())
                high=list[i];
        return high;
    }
    /**
     * Gets the average score of the class
     * @return average score of the class
     */
    public int getClassAverage(){
        int total=0;
        for(int i=0;i<c;i++)
            total+=list[i].getAverage();
        return total/c;
    }
    /**
     * Gets the student at the given index
     * @param i index of the student to get
     * @return student at given index
     */
    public Student getStudent(int i){
        if(i>0 && i<10)
            return list[i];
        return null;
    }
    /**
     * Gets the student with the given name
     * @param s name of the student
     * @return student with given name
     */
    public Student getStudent(String s){
        for(int i=0;i<c;i++)
            if(list[i].getName().equals(s))
                return list[i];
        return null;
    }
    /**
     * Returns the object as a string
     */
    public String toString(){
        String s="";
        for(int i=0;i<c;i++)
            s+=list[i].toString()+"\n";
        s+="Class Average: "+getClassAverage()+"\n";
        s+="Highest score\n"+getHighScore().toString()+"\n";
        return s;
    }
}