package Oop;

class Pen {
    String name;
    String color;

    Pen() {
        System.out.println("Constructor is called");
    }

    public void write() {
        System.out.println("write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class LearnOop {

    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.name = "saino";
        pen.color = "black";
        System.out.println(pen.name + " is a " + pen.color + " pen");

        pen.write();

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.printColor();
    }
}
