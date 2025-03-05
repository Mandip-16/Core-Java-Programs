package DesignPattern.SingleTon;

public class Test {
    public static void main(String[] args) {
        SingleTon singleton1 = SingleTon.getObject();
        SingleTon singleTon2 = SingleTon.getObject();

        System.out.println(singleton1 == singleTon2);
    }
}
