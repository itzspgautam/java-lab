//Lab 8: Question 2
class Student {
    String Student_name;
    int Student_roll;
    double Student_fee;
    Student(String Student_name, int Student_roll, double Student_fee) {
        this.Student_name = Student_name;
        this.Student_roll = Student_roll;
        this.Student_fee = Student_fee;
    }
    void Display() {
        System.out.println("Name: " + Student_name + "\nRoll: " + Student_roll + "\nFee: " + Student_fee);
    }
}
public class Lab8_Q2 {
	public static void main(String[] args) {
        Student s1 = new Student("Suraj", 101, 10000);
        s1.Display();
    }
}
