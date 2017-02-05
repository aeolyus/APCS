import java.util.*;
/**
 * @author Richard Huang
 */
public class School2{
    ArrayList<Student2> list;
    /**
     * Initializes a new school
     */
    public School2(){
        list=new ArrayList<Student2>();
    }
    /**
     * Adds a student to the list
     * @param s student to be added to the  list
     */
    public void add(Student2 s){
        list.add(s);
    }
    /**
     * Adds a new student with given name and test scores to the list
     * @param s given name of student
     * @param a given test scores of student
     */
    public void add (String s,ArrayList<Integer> a){
        list.add(new Student2(s,a));
    }
    /**
     * Adds a new student with given name
     * @param s given name of student
     */
    public void add(String s){
        list.add(new Student2(s));
    }
    /**
     * Adds a blank student to the list
     */
    public void add(){
        list.add(new Student2());
    }
    /**
     * Removes the given student
     * @param s student to be removed
     */
    public void remove(Student2 s){
        list.remove(s);
    }
    /**
     * Removes the student at the given index
     * @param i given index of the student to be removed
     */
    public void remove(int i){
        list.remove(i);
    }
    /**
     * Removes the student with the given name
     * @param s name of the student to be removed
     */
    public void remove(String s){
        for(int i=0;i<list.size();i++)
            if(list.get(i).getName().equals(s))
                list.remove(i);
    }
    /**
     * Replaces the student at the gven index
     * @param i index of the student to be replaced
     * @param s student to replace the old student
     */
    public void replace(int i, Student2 s){
        list.set(i,s);
    }
    /**
     * Gets the stuent with the highest score
     * @return student with the highest score
     */
    public Student2 getHighScore(){
        Student2 high=new Student2();
        for(int i=0;i<list.size();i++)
            if(list.get(i).getHighScore()>high.getHighScore())
                high=list.get(i);
        return high;
    }
    /**
     * Gets the average score of the class
     * @return average score of the class
     */
    public int getClassAverage(){
        int total=0;
        for(int i=0;i<list.size();i++)
            total+=list.get(i).getAverage();
        return total/list.size();
    }
    /**
     * Gets the student at the given index
     * @param i index of the student to get
     * @return student at given index
     */
    public Student2 getStudent(int i){
        if(i>0 && i<10)
            return list.get(i);
        return null;
    }
    /**
     * Gets the student with the given name
     * @param s name of the student
     * @return student with the given name
     */
    public Student2 getStudent(String s){
        for(int i=0;i<list.size();i++)
            if(list.get(i).getName().equals(s))
                return list.get(i);
        return null;
    }
    /**
     * Returns the object as a string
     */
    public String toString(){
        String s="";
        for(int i=0;i<list.size();i++)
            s+=list.get(i).toString()+"\n";
        s+="Class Average: "+getClassAverage()+"\n";
        s+="Highest score\n"+getHighScore().toString()+"\n";
        return s;
    }
}