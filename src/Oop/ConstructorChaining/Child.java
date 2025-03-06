package Oop.ConstructorChaining;

public class Child extends Parent {
    Child() {
        super("Hello from Child");
        System.out.println("Child class default constructor");
    }

    Child(String message) {
        this();
        System.out.println("Child class parameterized constructor: " + message);
    }

    // Edge case: Preventing recursive constructor call
    Child(boolean preventRecursion) {
        super("Safe Constructor Call");
        if (preventRecursion) {
            System.out.println("Safe constructor to prevent recursion");
        }
    }

    public static void main(String[] args) {
        System.out.println("Normal Constructor Chaining:");
        Child child1 = new Child();

        System.out.println("\nParameterized Constructor Chaining:");
        Child child2 = new Child("Custom message");

        System.out.println("\nHandling Recursive Constructor Call:");
        Child child3 = new Child(true);
    }
}
