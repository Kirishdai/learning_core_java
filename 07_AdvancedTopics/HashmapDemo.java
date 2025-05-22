// HashmapDemo.java
// Demonstrates basic operations on a HashMap in Java

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {

        // Create a HashMap with String keys and Double values
        HashMap<String, Double> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.90);
        map.put("coconut", 1.00);

        // Remove an entry by key
        map.remove("apple");

        // Check if a key exists in the map
        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        } else {
            System.out.println("Not found");  // Expected since "apple" was removed
        }

        // Print the size of the map
        System.out.println(map.size());  // Output: 3

        // Loop through all entries and print them
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
