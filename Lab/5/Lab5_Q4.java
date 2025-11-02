//Lab 5: Question 4
import java.util.Scanner;
class Shape {
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    double area(double length, double breadth) {
        return length * breadth;
    }
    double area(int side) {
        return side * side;
    }
}
public class Lab5_Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println("Choose the shape to find area:");
        System.out.println("1. Circle \n2. Rectangle \n3. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + shape.area(radius));
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + shape.area(length, breadth));
                break;
            case 3:
                System.out.print("Enter side of square: ");
                int side = sc.nextInt();
                System.out.println("Area of Square = " + shape.area(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
