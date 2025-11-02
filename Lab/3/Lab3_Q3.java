//Lab 3: Question 3
import java.util.Scanner;
public class Lab3_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        double area = 0;
        switch (ch) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                area = 3.14 * r * r;
                break;
            case 2:
                System.out.print("Enter side: ");
                double s = sc.nextDouble();
                area = s * s;
                break;
            case 3:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                area = 0.5 * b * h;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        System.out.println("Area = " + area);
    }
}