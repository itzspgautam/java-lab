//Lab 1: Question 1
public class Lab1_Q1 {
    public static void main(String[] args) {
        System.out.println("---- (a) Print Hello ----");
        System.out.println("Hello " + args[0]);
        System.out.println("\n---- (b) Display multiple strings ----");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Message: " + args[i]);
        }
        if (args.length >= 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("\n---- (c) Arithmetic Operations ----");
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
        }
        if (args.length >= 3) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int z = Integer.parseInt(args[2]);

            int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
            System.out.println("\n---- (d) Largest among three ----");
            System.out.println("Largest number: " + largest);

            double avg = (x + y + z) / 3.0;
            System.out.println("\n---- (e) Average of three ----");
            System.out.println("Average: " + avg);
        }
    }
}
