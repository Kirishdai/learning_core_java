// PolymorphismDemo.java
// Demonstrates runtime polymorphism using method overriding

// Parent class
class Creature {
    void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child class 1
class Cat extends Creature {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Child class 2
class Cow extends Creature {
    @Override
    void makeSound() {
        System.out.println("The cow moos.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Parent class reference to different child objects
        Creature c1 = new Cat();   // Upcasting
        Creature c2 = new Cow();

        c1.makeSound();  // Output: The cat meows.
        c2.makeSound();  // Output: The cow moos.

        // Even though the reference type is Animal,
        // the actual method executed depends on the object type (Cat or Cow)
    }
}
