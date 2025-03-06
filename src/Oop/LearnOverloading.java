package Oop;

class Sumation {

    public void sum(int num1,int num2,int num3) {
        System.out.println(num1+num2+num3);
    }

    public int sum(int num1,int num2) {
        return num1+num2;
    }
}

public class LearnOverloading {

    public static void main(String[] args) {
        Sumation sumation = new Sumation();
        sumation.sum(1,2,3);
        int SUM = sumation.sum(1,2);

        System.out.println(SUM);

    }
}
