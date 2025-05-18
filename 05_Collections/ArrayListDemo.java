// ArrayListDemo.java
// Demonstrates basic ArrayList operations in Java

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
    }
}
