package Inheritance.Assignment;

//Shape class
abstract class Shape {
	// Abstract method to be implemented by subclasses
	public abstract double getArea();
}

//Circle class extending Shape
class Circle extends Shape {
	// Attribute for radius
	int radius;

	// Constructor to initialize radius
	public Circle(int radius) {
		this.radius = radius;
	}

	// Override the getArea() method to calculate area of the circle
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}

//Square class extending Shape
class Square extends Shape {
	// Attribute for side length
	int length;

	// Constructor to initialize length
	public Square(int length) {
		this.length = length;
	}

	// Override the getArea() method to calculate area of the square
	@Override
	public double getArea() {
		return length * length; 
	}
}

//Rectangle class extending Shape
class Rectangle extends Shape {
	// Attributes for width and height
	int width, height;

	// Constructor to initialize width and height
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// Override the getArea() method to calculate area of the rectangle
	@Override
	public double getArea() {
		return width * height; 
	}
}

//Main class to test the program
public class Main {
	public static void main(String[] args) {
		// Create objects for each shape
		Shape circle = new Circle(25); 
		Shape square = new Square(9); 
		Shape rectangle = new Rectangle(8, 6); 

		// Call the getArea() method for each shape
		System.out.println("Area of Circle: " + circle.getArea());
		System.out.println("Area of Square: " + square.getArea());
		System.out.println("Area of Rectangle: " + rectangle.getArea());
	}
}
