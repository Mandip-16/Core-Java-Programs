package Java8.LearnFunctionalInterfaceDemo;

public interface LambdaEx {
    public void add(int a,int b);
}

class Main{
    public static void main(String[] args) {
        LambdaEx lambdaEx = (a,b) -> System.out.println("sum of two number is : " + (a+b));
        lambdaEx.add(1,2);
        lambdaEx.add(2,5);
    }
}