package main;

// create class car
public class Car {
    // Attributes
    private String make;
    private String model;
    private short year;
    private int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    // Main method
    public static void main(String[] args) {
        // Creating car objects
        Car car1 = new Car("lamborghini", "urus", (short) 2010, 20000);
        Car car2 = new Car("ferrari", "f40", (short) 2019, 22000);
        Car car3 = new Car("Ford", "Mustang", (short) 1968, 30000);

        // Displaying car details
        car1.displayCarDetails();
        System.out.println();
        car2.displayCarDetails();
        System.out.println();
        car3.displayCarDetails();
    }
}