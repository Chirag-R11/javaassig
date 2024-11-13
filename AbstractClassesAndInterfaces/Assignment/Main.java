package AbstractClassesAndInterfaces.Assignment;

//Animal class
class Animal {
	// Method to be overridden by subclasses
	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}
}

//Dog class that extends Animal
class Dog extends Animal {
	// Override the makeSound method for Dog
	@Override
	public void makeSound() {
		System.out.println("The dog barks.");
	}
}

//Cat class that extends Dog (multilevel inheritance)
class Cat extends Dog {
	// Override the makeSound method for Cat
	@Override
	public void makeSound() {
		System.out.println("The cat meows.");
	}
}

//Main class
public class Main {
	public static void main(String[] args) {
		// Create an object of Dog and call makeSound()
		Animal myDog = new Dog();
		myDog.makeSound(); 

		// Create an object of Cat and call makeSound()
		Animal myCat = new Cat();
		myCat.makeSound(); 

		// Create an object of Animal and call makeSound()
		Animal myAnimal = new Animal();
		myAnimal.makeSound(); 
	}
}
