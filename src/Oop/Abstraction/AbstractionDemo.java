package Oop.Abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();

        // Edge case: Attempting to instantiate an abstract class
        // Animal animal = new Animal(); // This will cause a compilation error

        // Edge case: Casting to the wrong type
        if (dog instanceof Cat) {
            Cat castedCat = (Cat) dog;
            castedCat.makeSound();
        } else {
            System.out.println("dog is not an instance of Cat");
        }
    }
}
