package oops.assignment;

//Superclass of Animal
class Animal {
 // Method in Animal class
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass of Dog, which overrides makeSound() method
class Dog extends Animal {
 // Overriding the makeSound() method to print Dog's sound
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass of Cat, which overrides makeSound() method
class Cat extends Animal {
 // Overriding the makeSound() method to print Cat's sound
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class for method overriding
public class Animals {
 public static void main(String[] args) {
     // Creating objects of Animal, Dog, and Cat
     Animal animal = new Animal();  // Creating an Animal object
     Animal dog = new Dog();        // Creating a Dog object (but using Animal reference)
     Animal cat = new Cat();        // Creating a Cat object (but using Animal reference)
     
     // prints the sounds for each animal
     System.out.println("Animal sound:");
     animal.makeSound();  

     System.out.println("\nDog sound:");
     dog.makeSound();  

     System.out.println("\nCat sound:");
     cat.makeSound();  
 }
}
