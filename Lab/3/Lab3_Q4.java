//Lab 3: Question 4
import java.util.Scanner;
class Box {
    double length, width, height;
    void volume() {
        double vol = length * width * height;
        System.out.println("Volume = " + vol);
    }
}
public class Lab3_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        System.out.println("\nLength = " + b.length);
        System.out.println("Width = " + b.width);
        System.out.println("Height = " + b.height);

        b.volume();  // calling the method
    }
}
