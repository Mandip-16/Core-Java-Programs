package DesignPattern.Abstract;

abstract class Vehicle{
    abstract void move();
}

class car extends Vehicle {
    void move() {
        System.out.println("car moving on a road");
    }
}

class Bicycle extends Vehicle {
    void move() {
        System.out.println("bicycle is running by paddeling");
    }
}

public class LearnAbstract {

    public static void main(String[] args) {
        Vehicle car = new car();
        Vehicle bicycle = new Bicycle();
        car.move();
        bicycle.move();
    }
}
