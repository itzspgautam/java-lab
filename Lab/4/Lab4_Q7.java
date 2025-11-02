//Lab 4: Question 7
import java.util.Scanner;
public class Lab4_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println("Sum of proper divisors: " + sum);

        if (sum == n)
            System.out.println(n + " is a Perfect number.");
        else if (sum > n)
            System.out.println(n + " is an Abundant number.");
        else
            System.out.println(n + " is a Deficient number.");
    }
}