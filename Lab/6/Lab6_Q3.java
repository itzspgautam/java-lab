//Lab 6: Question 3
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// Class representing a customer's bank deposit
class BankDeposit {
    int id;
    String name;
    int balance;
    // Constructor to initialize customer data
    BankDeposit(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    // Method to display customer details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Balance: " + balance);
    }
}
public class Lab6_Q3 {
    public static void main(String[] args) {
        // Create an ArrayList of BankDeposit objects with hardcoded data
        ArrayList<BankDeposit> customers = new ArrayList<>();
        customers.add(new BankDeposit(1, "Maria", 200));
        customers.add(new BankDeposit(2, "Riya", 500));
        customers.add(new BankDeposit(3, "Ravi", 1000));
        customers.add(new BankDeposit(4, "Azmir", 500));
        customers.add(new BankDeposit(5, "Varun", 100));
        // Step 1: Display original list
        System.out.println("Original Customer List:");
        for (BankDeposit customer : customers) {
            customer.display();
        }
        // Step 2: Sort the list by balance in ascending order
        Collections.sort(customers, Comparator.comparingInt(c -> c.balance));
        // Step 3: Display sorted list
        System.out.println("\nSorted Customer List (by Balance Ascending):");
        for (BankDeposit customer : customers) {
            customer.display();
        }
        // Step 4: Search for customer with ID 3 and withdraw 250
        System.out.println("\nAfter 250 withdrawal by Customer ID 3:");
        for (BankDeposit customer : customers) {
            if (customer.id == 3) {
                customer.balance -= 250;
                customer.display();
                break;
            }
        }
    }
}
