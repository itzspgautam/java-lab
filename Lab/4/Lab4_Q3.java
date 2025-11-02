//Lab 4: Question 3
class StudentQ3 {
    // static variable (shared by all objects)
    static String college = "BIT Mesra";

    // instance variable (unique for each object)
    String name;
    int roll;

    StudentQ3(String n, int r) {
        name = n;
        roll = r;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("College: " + college);
        System.out.println();
    }
}
public class Lab4_Q3 {
    public static void main(String[] args) {
        StudentQ3 s1 = new StudentQ3("Amit", 101);
        StudentQ3 s2 = new StudentQ3("Neha", 102);

        s1.display();
        s2.display();

        // Changing static variable using one object
        s1.college = "XYZ University";

        System.out.println("After changing college name:\n");

        s1.display();
        s2.display();
    }
}
