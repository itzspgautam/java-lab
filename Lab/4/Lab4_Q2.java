//Lab 4: Question 2
class StudentQ2 {
    String name;
    int roll;
    double fee;
    // Default constructor
    StudentQ2() {
        name = "Unknown";
        roll = 0;
        fee = 0.0;
    }
    // Parameterized constructor
    StudentQ2(String n, int r, double f) {
        name = n;
        roll = r;
        fee = f;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Fee: " + fee);
        System.out.println();
    }
}

public class Lab4_Q2 {
    public static void main(String[] args) {
        // Using default constructor
        StudentQ2 s1 = new StudentQ2();

        // Using parameterized constructor
        StudentQ2 s2 = new StudentQ2("Amit", 101, 25000.50);

        s1.display();
        s2.display();
    }
}
