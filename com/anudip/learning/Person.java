/*
Assignment-3.
● Create a class Person
● Add member variables name as String, age and salary as int
● Initialize the member variable along with declaration.
● Now put the previous Person class in a package com.anudip.learning
● Add a main method. Add a print message “Test Successful”.
● Run the class after compilation.
● Modify the classpaths to see the error messages on the console.
*/

//created package name com.anudip.learning 
package com.anudip.learning;

//created a class person
public class Person {
	//member variables 
	protected String name = "Chirag R";
    protected int age = 22;
    protected int salary = 62000;

    //main method
	public static void main(String[] args) {
		//print
		System.out.println("Test Successful");
	}

}
