package Java8.MethodandContructorRefrances;

interface interf {
    public void m1();
}

public class MethodReference {

    public static void m2() {
        System.out.println("hello!");
    }

    public static void main(String[] args) {
        interf i = MethodReference :: m2;
        i.m1();
    }
}
