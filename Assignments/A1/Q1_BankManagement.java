class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }
    // Withdraw method
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }
    // Display balance
    public void displayBalance() {
        System.out.print("\n---ACCOUNT INFORMATION---");
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}
// Main Class
public class Q1_BankManagement {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("\n---ACCOUNT CREATION---\n");
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Opening Balance: ");
        double bal = sc.nextDouble();

        BankAccount acc = new BankAccount(accNo, name, bal);
        System.out.println("\nAccount Created Successfully!\n");

        int choice;
        do {
            System.out.println("----- Banking Menu -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    try {
                        acc.withdraw(wd);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
            System.out.println();
        } while (choice != 4);
        sc.close();
    }
}

