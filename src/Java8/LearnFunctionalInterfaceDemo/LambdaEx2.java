package Java8.LearnFunctionalInterfaceDemo;

public interface LambdaEx2 {
    public int squareIt(int a);
}

class LambdaExample {
    LambdaEx2 lx = (a)->a*a;

    int i = lx.squareIt(3);
}
