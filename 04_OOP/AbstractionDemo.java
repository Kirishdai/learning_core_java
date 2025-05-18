// AbstractionDemo.java
// Demonstrates abstraction using abstract classes and methods

// Abstract class (cannot be instantiated)
abstract class Vehicle {
    // Abstract method (no body)
    abstract void startEngine();

    // Concrete method
    void fuelUp() {
        System.out.println("Fueling the vehicle...");
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Must override the abstract method
    @Override
    void startEngine() {
        System.out.println("Starting the car engine...");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); //  Error: Cannot instantiate abstract class
        // Instantiate child class and use abstract + concrete methods
        Vehicle myCar = new Car();
        myCar.startEngine(); // Output: Starting the car engine...
        myCar.fuelUp();      // Output: Fueling the vehicle...
    }
}
