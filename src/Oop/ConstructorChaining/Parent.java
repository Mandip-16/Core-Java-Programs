package Oop.ConstructorChaining;

public class Parent {
    Parent() {
        System.out.println("Parent class default constructor");
    }

    Parent(String message) {
        this();
        System.out.println("Parent class parameterized constructor: " + message);
    }
}
