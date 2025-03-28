// StaticDemo.java
public class StaticDemo {
    // Static variable
    static int staticCounter;

    // Static block - executes once when the class is loaded
    static {
        staticCounter = 10;
        System.out.println("Static block executed. StaticCounter initialized to " + staticCounter);
    }

    // Static method
    static void displayCounter() {
        System.out.println("Static method called. Current StaticCounter: " + staticCounter);
    }

    // Non-static method to modify the static variable
    void incrementCounter() {
        staticCounter++;
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");

        // Accessing static method without creating an object
        StaticDemo.displayCounter();

        // Creating objects and modifying static variable
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        obj1.incrementCounter();
        obj2.incrementCounter();

        // Calling static method again after incrementing
        StaticDemo.displayCounter();
    }
}
