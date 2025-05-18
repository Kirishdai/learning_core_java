// FileWriteReadDemo.java
// Demonstrates writing to and reading from a file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteReadDemo {
    public static void main(String[] args) {
        String filename = "demo.txt";

        // Write to the file
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, Garp!\nWelcome to File I/O in Java.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        // Read from the file
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            System.out.println("\nFile contents:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
