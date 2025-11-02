//Lab 9: Question 4 (Optional)
import java.util.Scanner;
class Vehicle {
    String number, type, model;
    double rate;
    Vehicle(String number, String type, String model, double rate) {
        this.number = number;
        this.type = type;
        this.model = model;
        this.rate = rate;
    }
    double calculateRent(int days) {
        return rate * days;
    }
}
class Car extends Vehicle {
    Car() { super("C101", "Car", "Honda City", 1800); }
    double calculateRent(int d) { return super.calculateRent(d) + 500; }
}
class Bike extends Vehicle {
    Bike() { super("B201", "Bike", "Royal Enfield", 700); }
}
class Bus extends Vehicle {
    Bus() { super("BS301", "Bus", "Volvo AC", 2500); }
    double calculateRent(int d) { return super.calculateRent(d) + 1000; }
}
public class Lab9_Q4_Optional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vehicle type (car/bike/bus): ");
        String type = sc.next().toLowerCase();

        Vehicle v;
        if (type.equals("car")) v = new Car();
        else if (type.equals("bike")) v = new Bike();
        else if (type.equals("bus")) v = new Bus();
        else { System.out.println("Invalid type!"); return; }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        double rent = v.calculateRent(days);
        System.out.println("\nVehicle: " + v.model + "\nDays: " + days + "\nTotal Rent: ₹" + rent);
        sc.close();
    }
}
