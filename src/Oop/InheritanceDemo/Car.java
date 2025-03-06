package Oop.InheritanceDemo;

class Car extends Vehicle {
    int numDoors;

    void displayCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors: " + numDoors);
    }
}