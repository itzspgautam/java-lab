//Lab 1: Question 4
class Test {
    void show() {
        System.out.println("This is class Test");
    }
}
class Test1 {
    void show() {
        System.out.println("This is class Test1");
    }
}

class Test2 {
    void show() {
        System.out.println("This is class Test2");
    }
}

class Lab1_Q4 {
    public static void main(String[] args) {
        Test t = new Test();
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();

        t.show();
        t1.show();
        t2.show();
    }
}
