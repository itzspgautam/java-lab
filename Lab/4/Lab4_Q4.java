//Lab 4: Question 4
class MathUtilsQ4 {
    // static method
    static void showSquare(int num) {
        System.out.println("Square of " + num + " is: " + (num * num));
    }
}

public class Lab4_Q4 {
    public static void main(String[] args) {
        // calling static method without creating an object
        MathUtilsQ4.showSquare(5);
        MathUtilsQ4.showSquare(10);
    }
}

