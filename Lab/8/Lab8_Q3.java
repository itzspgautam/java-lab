//Lab 8: Question 3
class Student {
    String Student_name;
    int Student_roll;
    double Student_fee;
    Student(String Student_name, int Student_roll, double Student_fee) {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll;
        this.Student_fee = Student_fee;
    }
    Student() {
        this("Gautam", 102, 50000);
    }
    void Show(Student obj) {
        this.Display();
        System.out.println("Displaying From Show Function");
    }
    void Display() {
        System.out.println("Name: " + Student_name + "\nRoll: " + Student_roll + "\nFee: " + Student_fee);
    }
}
public class Lab8_Q3 {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", 101, 10000);
        Student s2 = new Student();
        s2.Show(s1);
        s2.Show(s2);
    }
}