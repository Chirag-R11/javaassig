/*
Assignment-2.
● Create a new class Employee
● Add member variables: id and age of type int, name of type String and isPermanent of type 
boolean
● Now assign values 35.5 to age; See the error message.
● How can you avoid this error? Correct the error by casting.
● Make all the members protected
● Add a main method to it. Print message “Successfully started”.
● Compile the class.
*/

//package assignment is been created
package assignment;

//class name Employee
public class Employee {
	//member variables 
		protected int id;
	    protected int age;
	    protected String name;
	    protected boolean isPermanent;

	    //main method
	public static void main(String[] args) {
		 Employee e = new Employee();
		 //e.age = 35.5; // The error message : cannot convert from double to int
		 e.age = (int) 35.5; // fixed error by casting.
	     System.out.println("Successfully started");

	}

}
