package Java8.MethodandContructorRefrances;

public class Test {

    public void m1() {
        for (int i=0; i<10; i++) {
            System.out.println("child");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Runnable r = test :: m1;

        Thread t = new Thread(r);
        t.start();

        for (int i=0; i<10; i++) {
            System.out.println("main");
        }
    }
}
