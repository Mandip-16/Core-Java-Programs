package Oop.Overriding;

public class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        // Edge cases for polymorphism
        Shape dynamicShape = new Circle();
        dynamicShape.draw();

        dynamicShape = new Rectangle();
        dynamicShape.draw();

        // Attempting invalid casting
        if (dynamicShape instanceof Circle) {
            Circle castedCircle = (Circle) dynamicShape;
            castedCircle.draw();
        } else {
            System.out.println("dynamicShape is not an instance of Circle");
        }
    }
}
