package Oop.Polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition (int): " + calc.add(5, 10));
        System.out.println("Addition (double): " + calc.add(5.5, 10.2));
    }
}