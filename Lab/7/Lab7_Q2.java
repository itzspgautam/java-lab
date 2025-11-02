//Lab 7: Question 2
import java.util.Scanner;
public class Lab7_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];
        int num = 0;
        for (int i = 0; i < rows; i++) {
            arr[i] = new int[i + 1];     // create ith row with i+1 columns
            for (int j = 0; j <= i; j++) {
                arr[i][j] = num++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
