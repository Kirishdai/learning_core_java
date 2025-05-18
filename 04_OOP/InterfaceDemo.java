// InterfaceDemo.java
// Demonstrates how interfaces work in Java

// Define an interface (all methods are public + abstract by default)
interface Flyable {
    void fly();  // abstract method
}

// Implementing the interface in a class
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird flaps its wings and flies.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane takes off using engines.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface references to different implementations
        Flyable b1 = new Bird();
        Flyable a1 = new Airplane();

        b1.fly();  // Output: The bird flaps its wings and flies.
        a1.fly();  // Output: The airplane takes off using engines.
    }
}
