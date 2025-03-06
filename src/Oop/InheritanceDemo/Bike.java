package Oop.InheritanceDemo;

class Bike extends Vehicle {
    boolean hasCarrier;

    void displayBikeInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Has Carrier: " + hasCarrier);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.numDoors = 4;
        car.start();
        car.displayCarInfo();

        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.hasCarrier = true;
        bike.start();
        bike.displayBikeInfo();

        // Edge case: Accessing parent class methods from child objects
        Vehicle vehicle = new Car();
        vehicle.start();

        // Casting to access child class-specific methods
        if (vehicle instanceof Car) {
            Car castedCar = (Car) vehicle;
            castedCar.displayCarInfo();
        }
    }
}