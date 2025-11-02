//Lab 7: Question 1
import java.util.Scanner;
class Student {
    int roll;
    String name;
    double cgpa;
    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }
    void display() {
        System.out.println("Roll: " + roll + "  Name: " + name + "  CGPA: " + cgpa);
    }
}
public class Lab7_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        double total = 0;
        // Input details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int r = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nm = sc.nextLine();
            System.out.print("CGPA: ");
            double c = sc.nextDouble();

            s[i] = new Student(r, nm, c);
            total += c;
        }
        // Display all students
        System.out.println("\n--- Student Details ---");
        for (Student st : s)
            st.display();
        // (a) Search by roll number
        System.out.print("\nEnter roll number to search: ");
        int roll = sc.nextInt();
        boolean found = false;
        for (Student st : s) {
            if (st.roll == roll) {
                System.out.println("Found! Name: " + st.name + ", CGPA: " + st.cgpa);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found!");
        // (b) Average CGPA
        System.out.println("\nAverage CGPA: " + (total / n));
        // (c) Sort by CGPA (descending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].cgpa < s[j].cgpa) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("\n--- Rank List ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ": " + s[i].name + " (" + s[i].cgpa + ")");
        }
        // (d) Highest and Lowest CGPA
        System.out.println("\nHighest CGPA: " + s[0].name + " (" + s[0].cgpa + ")");
        System.out.println("Lowest CGPA: " + s[n - 1].name + " (" + s[n - 1].cgpa + ")");

        sc.close();
    }
}
