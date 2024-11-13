package Inheritance.Assignment;

//Vehicle class
class Vehicle {
 // Vehicle attributes
 String make;
 String model;
 int year;
 int maximumSpeed;

 // Constructor to initialize the vehicle's details
 public Vehicle(String make, String model, int year, int maximumSpeed) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.maximumSpeed = maximumSpeed;
 }

 // Method to simulate driving the vehicle
 public void drive() {
     System.out.println(make + " " + model + " is driving.");
 }
}

//Car class extending Vehicle
class Car extends Vehicle {

 // Constructor to initialize car details
 public Car(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed); // Initialize Vehicle attributes
 }

 // Override drive method for car
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Car is driving.");
 }
}

//Bike class extending Vehicle
class Bike extends Vehicle {

 // Constructor to initialize bike details
 public Bike(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed); // Initialize Vehicle attributes
 }

 // Override drive method for bike
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Bike is driving.");
 }
}

//Main class
public class Main1 {
 public static void main(String[] args) {
     // Create car and bike objects with new details
     Car car = new Car("Ford", "Mustang", 1969, 120);
     Bike bike = new Bike("Kawasaki", "Ninja ZX-10R", 2023, 300);

     // Print car details
     System.out.println("Car details:");
     System.out.println("Make: " + car.make);
     System.out.println("Model: " + car.model);
     System.out.println("Year: " + car.year);
     System.out.println("Max Speed: " + car.maximumSpeed);
     
     // Call the drive method for car
     car.drive();

     // Print bike details
     System.out.println("\nBike details:");
     System.out.println("Make: " + bike.make);
     System.out.println("Model: " + bike.model);
     System.out.println("Year: " + bike.year);
     System.out.println("Max Speed: " + bike.maximumSpeed);
     
     // Call the drive method for bike
     bike.drive();
 }
}
