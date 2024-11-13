/*
Assignment-4.
● Create a class Rectangle
● Add a member variable width and height of type double.
● Create an enum Color with values RED, GREEN, BLUE
● Create a member variable boxColor of type Color.
● Add a main method.
● In main method just print the enum Color.BLUE (You will notice that Java prints the enum 
name as it is.)
● Compile and run the class.
*/

//package assignment is been created
package assignment;

// class name Rectangle
public class Rectangle {
	//member variables protected
	protected double width;
    protected double height;
    
    // enum name Color with values RED, GREEN, BLUE 
    public enum Color {
    	RED, GREEN, BLUE
    }
    //member variable boxColor of type Color
    protected Color boxColor;

    // main method
	public static void main(String[] args) {
		// Print the enum value color.BLUE
        System.out.println(Color.BLUE);
	}

}
