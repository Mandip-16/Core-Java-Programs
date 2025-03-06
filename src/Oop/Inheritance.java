package Oop;

class Shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(double l, double h) {
        double area = (0.5)*l*h;
        System.out.println(area);
    }
}

class Square extends Shape {
    public void area(int l) {
        System.out.println(Math.pow(l,4));
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.area(2,4);
        Square square = new Square();
        square.area();
        square.area(3);

    }
}
