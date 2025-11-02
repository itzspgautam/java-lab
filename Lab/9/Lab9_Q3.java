//Lab 9: Question 3
import java.util.Scanner;
class Vehicle {
    int rentPerDay;
    void calculateRent(int day) {
        System.out.println("Total Rent= " + rentPerDay * day + "INR (" + day + " Days X " + rentPerDay + " INR)");
    }
}
class Bike extends Vehicle {
    Bike() {
        rentPerDay = 1000;
        System.out.println("Rent per day of Bike= " + rentPerDay);
    }
}
class Car extends Vehicle {
    Car() {
        rentPerDay = 4000;
        System.out.println("Rent per day of Car= " + rentPerDay);
    }
}
class Bus extends Vehicle {
    Bus() {
        rentPerDay = 6000;
        System.out.println("Rent per day of Bus= " + rentPerDay);
    }
}
public class Lab9_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========SELECT VEHICLE TO RENT==========");
        System.out.println("1.Bike\n2.Car\n3.Bus");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Vehicle v = null;
        switch (choice) {
            case 1: v = new Bike(); break;
            case 2: v = new Car(); break;
            case 3: v = new Bus(); break;
            default: System.out.println("Invalid Choice! closing the program."); return;
        }
        System.out.print("Enter days to rent: ");
        int day = sc.nextInt();
        v.calculateRent(day);
    }
}

