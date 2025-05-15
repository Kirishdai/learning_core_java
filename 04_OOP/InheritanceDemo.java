// InheritanceDemo.java
// Demonstrates basic inheritance and method overriding

// Parent class (Base class)
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    void eat() {
        System.out.println("The animal eats food.");
    }
}

// Child class (Derived from Animal)
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }

    void fetch() {
        System.out.println("The dog fetches the ball.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the parent class
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: The animal makes a sound.
        genericAnimal.eat();        // Output: The animal eats food.

        System.out.println();

        // Create an object of the child class
        Dog dog = new Dog();
        dog.makeSound();  // Output: The dog barks. (Overridden)
        dog.eat();        // Inherited from Animal
        dog.fetch();      // Specific to Dog
    }
}
