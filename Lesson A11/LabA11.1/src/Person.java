public class Person {
	  private String myName;   // name of the person
	  private int myAge;       // person's age
	  private String myGender; // "M" for male, "F" for female

	  /**
	   * Constructor
	   * @param name - person's name
	   * @param age - person's age
	   * @param gender - person's gender
	   */
	  public Person(String name, int age, String gender){
	    myName = name;
	    myAge = age;
	    myGender = gender;
	  }
	  /**
	   * Method to get the person's name
	   * @return - String representing the person's name
	   */
	  public String getName(){
	    return myName;
	  }
	  /**
	   * Method to get the person's age
	   * @return - person's age
	   */
	  public int getAge(){
	    return myAge;
	  }
	  /**
	   * Method to get the person's gender
	   * @return - String representing the person's gender
	   */

	  public String getGender(){
	    return myGender;
	  }
	  /**
	   * Method to set the person's name
	   * @param name - String representing the person's name
	   */
	  public void setName(String name){
	    myName = name;
	  }
	  /**
	   * Method to set the person's age
	   * @param age - person's age
	   */

	  public void setAge(int age){
	    myAge = age;
	  }
	  /**
	   * Method to set the person's gender
	   * @param gender - String representing the person's gender
	   */

	  public void setGender(String gender){
	    myGender = gender;
	  }
	  /**
	   * Method to create a String with the person's information
	   * @return string containing the person's information
	   */
	  public String toString(){
	    return myName + ", age: " + myAge + ", gender: " + myGender;
	  }
}