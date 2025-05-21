// AnonymousClassDemo.java
// Demonstrates method overriding using anonymous inner classes

// Parent class with eat() and speak() methods
class Parent {
    void eat() {
        System.out.println("This person does not eat chicken");
    }

    void speak() {
        System.out.println("The parent can only speak Nepali");
    }
}

// Regular child class extending Parent
class Child extends Parent {
    @Override
    void speak() {
        System.out.println("The child can speak English as well");
    }
}

public class AnonymousClassDemo {
    public static void main(String[] args) {

        // Regular child object
        Parent son = new Child();

        // Anonymous inner class extending Parent and overriding eat()
        Parent daughter = new Child() {
            @Override
            void eat() {
                System.out.println("This child can eat chicken");
            }
        };

        // Output for son (regular subclass)
        son.speak();   // Output: The child can speak English as well
        son.eat();     // Output: This person does not eat chicken

        // Output for daughter (anonymous class)
        daughter.speak(); // Output: The child can speak English as well
        daughter.eat();   // Output: This child can eat chicken
    }
}
