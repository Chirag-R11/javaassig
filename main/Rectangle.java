// created package name main
package main;

// created class name Rectangle
public class Rectangle {
    int length;
    int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Instantiate two Rectangle objects with random values
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(7, 8);

        // Calculate the areas of the rectangles
        int area1 = rectangle1.calculateArea();
        int area2 = rectangle2.calculateArea();

        // Compare the areas using relational operators
        if (area1 > area2) {
            System.out.println("rectangle1 > rectangle2");
        } else if (area1 < area2) {
            System.out.println("rectangle1 < rectangle2");
        } else {
            System.out.println("they are equal");
        }
    }
}