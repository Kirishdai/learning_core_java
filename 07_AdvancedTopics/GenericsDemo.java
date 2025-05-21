// GenericsDemo.java
// Demonstrates how to use generics with multiple type parameters

// Generic class with two type parameters: T and U
class Box<T, U> {
    T item;
    U value;

    // Constructor to initialize item and value
    public Box(T item, U value) {
        this.item = item;
        this.value = value;
    }

    // Getter for item (type T)
    public T getItem() {
        return item;
    }

    // Getter for value (type U)
    public U getValue() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {

        // Create Box objects with different type combinations
        Box<String, Double> box = new Box<>("Laptop", 42.15);
        Box<String, Integer> box2 = new Box<>("Tablet", 42);

        // Output the stored item and value
        System.out.println(box.getItem());   // Output: Laptop
        System.out.println(box2.getValue()); // Output: 42
    }
}
