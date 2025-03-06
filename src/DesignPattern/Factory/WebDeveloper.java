package DesignPattern.Factory;

public class WebDeveloper implements Employee{

    @Override
    public int salary() {
        System.out.println("Web developer salary is : ");
        return 40000;
    }
}
