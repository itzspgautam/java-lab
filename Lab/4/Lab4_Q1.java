//Lab 4: Question 1
class StudentQ1 {
    String student_name;
    int student_roll;
    double student_fee;

    // Parameterized constructor
    StudentQ1(String name, int roll, double fee) {
        student_name = name;
        student_roll = roll;
        student_fee = fee;
    }

    // Method to display student details
    void Display() {
        System.out.println("Name: " + student_name);
        System.out.println("Roll No: " + student_roll);
        System.out.println("Fee: " + student_fee);
        System.out.println();
    }
}

public class Lab4_Q1 {
    public static void main(String[] args) {
        // Creating two student objects with values
        StudentQ1 s1 = new StudentQ1("Amit", 101, 25000.50);
        StudentQ1 s2 = new StudentQ1("Neha", 102, 27000.75);

        // Display their details
        s1.Display();
        s2.Display();
    }
}
