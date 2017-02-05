import java.util.*;
/**
 * @author Richard Huang
 */
public class Student2{
    private String name;
    ArrayList<Integer> test=new ArrayList<Integer>(3);
    /**
     * Initializes a student with a blank name and 0's for all three tests
     */
    public Student2(){
        name="";
        for(int i=0;i<3;i++) 
			test.add(0);
    }
    /**
     * Initializes a student with a given name and 0's for all three tests
     * @param s student name
     */
    public Student2(String s){
        name=s;
        for(int i=0;i<3;i++) 
			test.add(0);
    }
    /**
     * Initializes a student with a given name and given array of test scores
     * @param s student name
     * @param a student test scores
     */
    public Student2(String s,ArrayList<Integer> a){
        name=s;
        test=a;
    }
    /**
     * Makes a copy of a student object
     * @param s original copy of sutdent object
     */
    public Student2(Student2 s){
        name=s.getName();
        for(int i=0;i<3;i++)
            test.set(i,s.getScore(i));
    }
    /**
     * Sets the new name of the student
     * @param s name of student to be set to
     */
    public void setName(String s){
        name=s;
    }
    /**
     * Returns the name of the student
     * @return name of the student
     */
    public String getName(){
        return name;
    }
    /**
     * Sets an individual test score
     * @param which index of the test in the array
     * @param score test value
     */
    public void setScore(int which,int score){
        if(which>2||which<0)
            test.set(2,score);
        else
            test.set(which-1,score);
    }
    /**
     * Sets the test scores to an array of test scores
     * @param a array of test scores
     */
    public void setScore(ArrayList<Integer> a){
        test=a;
    }
    /**
     * Gets the test score at a given index
     * @param which index of the test score
     * @return test score at given index
     */
    public int getScore(int which){
        if(which>2||which<0)
            return test.get(2);
        else
            return test.get(which);
    }
    /**
     * Gets the average test score
     * @return average test score
     */
    public int getAverage(){
        int total=0;
        for(int i=0;i<test.size();i++)
            total+=test.get(i);
        return total/test.size();
    }
    /**
     * Gets the highest test score
     * @return highest test score
     */
    public int getHighScore(){
        int high=0;
        for(int i=0;i<test.size();i++)
            if(test.get(i)>high)
                high=test.get(i);
        return high;
    }
    /**
     * Returns the object as a string
     */
    public String toString(){
        return "Name: "+name+": test 1: "+getScore(0)+" test 2: "+getScore(1)+" test 3: "+getScore(2)+" Average: "+getAverage()+" High Score: "+getHighScore();   
    }
}