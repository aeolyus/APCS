import java.util.*;
/**
 * @author Richard Huang
 */
public class Student{
    private String name;
    int[] test=new int[3];
    /**
     * Initializes a student with a blank name and 0's for all three tests
     */
    public Student(){
        name="";
    }
    /**
     * Initializes a student with a given name and 0's for all three tests
     * @param s student name
     */
    public Student(String s){
        name=s;
    }
    /**
     * Initializes a student with a given name and given array of test scores
     * @param s student name
     * @param a student test scores
     */
    public Student(String s,int[] a){
        name=s;
        test=a;
    }
    /**
     * Makes a copy of a student object
     * @param s original copy of student object
     */
    public Student(Student s){
        name=s.getName();
        test=s.test;
    }
    /**
     * Sets the name of the student
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
            test[2]=score;
        else
            test[which-1]=score;
    }
    /**
     * Sets the test scores to an aray of test scores
     * @param a array of test scores
     */
    public void setScore(int[] a){
        test=a;
    }
    /**
     * Gets the test score at the given index
     * @param which index of the test score
     * @return test score at given index
     */
    public int getScore(int which){
        if(which>2||which<0)
            return test[2];
        else
            return test[which];
    }
    /**
     * Gets the average test score
     * @return average test score
     */
    public int getAverage(){
        int total=0;
        for(int i=0;i<test.length;i++)
            total+=test[i];
        return total/test.length;
    }
    /**
     * Gets the highest test score
     * @return highest test score
     */
    public int getHighScore(){
        int high=0;
        for(int i=0;i<test.length;i++)
            if(test[i]>high)
                high=test[i];
        return high;
    }
    /**
     * Returns the object as a string
     */
    public String toString(){
        return "Name: "+name+": test 1: "+getScore(0)+" test 2: "+getScore(1)+" test 3: "+getScore(2)+" Average: "+getAverage()+" High Score: "+getHighScore();   
    }
}