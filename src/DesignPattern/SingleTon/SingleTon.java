package DesignPattern.SingleTon;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {

    }

    public static SingleTon getObject() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
