//Lab 3: Question 6
class ExampleQ6 {
    // static variable (shared by all objects)
    static int count = 0;

    // instance variable (different for each object)
    int number;

    ExampleQ6(int num) {
        number = num; // assign to instance variable
        count++;      // increase static variable
    }

    void showData() {
        System.out.println("Instance variable (number): " + number);
        System.out.println("Static variable (count): " + count);
        System.out.println();
    }
}

public class Lab3_Q6 {
    public static void main(String[] args) {
        ExampleQ6 obj1 = new ExampleQ6(10);
        ExampleQ6 obj2 = new ExampleQ6(20);
        ExampleQ6 obj3 = new ExampleQ6(30);

        obj1.showData();
        obj2.showData();
        obj3.showData();
    }
}
