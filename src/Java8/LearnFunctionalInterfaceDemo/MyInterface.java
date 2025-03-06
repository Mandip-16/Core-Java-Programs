package Java8.LearnFunctionalInterfaceDemo;

@FunctionalInterface
public interface MyInterface {

    public void Hello();
    public static void run(){

    }
    default void sayBye() {

    }

}
