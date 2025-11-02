//Lab 3: Question 4
public class Lab3_Q1 {
public static void main(String[] args) {
System.out.println("Rolling a dice 6 times...");
    for (int i = 1; i <= 6; i++) {
        int outcome = (int)(Math.random() * 6) + 1; 
        System.out.println("Roll " + i + ": " + outcome);
    }
}
}
