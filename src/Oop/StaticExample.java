package Oop;

class StaticExample {
    static int count = 0;
    int id;

    StaticExample() {
        count++;
        id = count;
    }

    static void showCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        obj1.showCount();
    }
}