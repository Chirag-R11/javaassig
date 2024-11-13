package Polymorphism.Assignment;

//Student class
class Student {
	// Instance variables
	String name;
	int age;
	String department;

	// Default constructor
	public Student() {
		this.name = "Unknown";
		this.age = 20;
		this.department = "Unassigned";
	}

	// Constructor with two parameters (name, age), sets department to "IT"
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.department = "IT";
	}

	// Constructor with three parameters (name, age, department)
	public Student(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	// Method to print student details
	public void printDetails() {
		System.out.println("Name: " + name + "\nAge: " + age +"\nDepartment: " + department+"\n");
	}
}

//Main class
public class Main {
	public static void main(String[] args) {
		// Create a student using the default constructor
		Student student1 = new Student();

		// Create a student using the constructor with two parameters (name, age)
		Student student2 = new Student("Darsha", 22);

		// Create a student using the constructor with three parameters (name, age, department)
		Student student3 = new Student("Chirag", 23, "Computer Application");

		// Print the details of each student
		System.out.println("Student 1 Details:");
		student1.printDetails();

		System.out.println("Student 2 Details:");
		student2.printDetails();

		System.out.println("Student 3 Details:");
		student3.printDetails();
	}
}
