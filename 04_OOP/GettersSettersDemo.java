// GettersSettersDemo.java
// Demonstrates encapsulation using getters and setters

    class Student {
        // Private fields: hidden from outside access
        private String name;
        private int age;

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age with simple validation
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("Invalid age!");
            }
        }
    }

    public class GettersSettersDemo {
        public static void main(String[] args) {
            Student s1 = new Student();

            // Setting values through setters
            s1.setName("Garp");
            s1.setAge(20);

            // Accessing values through getters
            System.out.println("Student Name: " + s1.getName());
            System.out.println("Student Age: " + s1.getAge());

            // Try setting invalid age
            s1.setAge(-5);  // Output: Invalid age!
        }
    }
