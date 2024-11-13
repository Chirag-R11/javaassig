package AbstractClassesAndInterfaces.Assignment;

//Abstract class Shape
abstract class Shape {
	// Abstract method to calculate area
	public abstract double calculateArea();
}

//Circle class extends Shape
class Circle extends Shape {
	private double radius;

	// Constructor to initialize the radius of the circle
	public Circle(double radius) {
		this.radius = radius;
	}

	// Override calculateArea() for Circle
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

//Rectangle class extends Shape
class Rectangle extends Shape {
	private double length;
	private double width;

	// Constructor to initialize length and width of the rectangle
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	// Override calculateArea() for Rectangle
	@Override
	public double calculateArea() {
		return length * width;
	}
}

//Main class
public class Main4 {
	public static void main(String[] args) {
		// A Circle object with radius 5
		Shape circle = new Circle(25);

		// A Rectangle object with length 4 and width 6
		Shape rectangle = new Rectangle(8, 6);

		// print the areas
		System.out.println("Area of the Circle: " + circle.calculateArea());
		System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
	}
}
