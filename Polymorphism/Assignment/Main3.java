package Polymorphism.Assignment;

//Vehicle/Base class
class Vehicle {
	public void start() {
		System.out.println("Vehicle started.");
	}
}

//Car/subclass of Vehicle
class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car started.");
	}
}

//Motorcycle class, subclass of Vehicle
class Motorcycle extends Vehicle {
	@Override
	public void start() {
		System.out.println("Motorcycle started.");
	}
}

//Garage class
class Garage {
	public void serviceVehicle(Vehicle vehicle) {
		vehicle.start(); // Calls the start() method of the specific vehicle object
		System.out.println("Vehicle serviced.");
	}
}

//Main class to test the program
public class Main3 {
	public static void main(String[] args) {
		// Create instances of Car and Motorcycle
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();

		// Create an instance of Garage
		Garage garage = new Garage();

		// Service both vehicles
		garage.serviceVehicle(car);
		garage.serviceVehicle(motorcycle);
	}
}
