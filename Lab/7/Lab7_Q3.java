//Lab 7: Question 3
import java.util.Arrays;
import java.util.Scanner;
public class Lab7_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];
        int totalLength = 0;

        // Input jagged array
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            totalLength += cols;

            System.out.println("Enter " + cols + " elements:");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Flatten 2D jagged array into 1D
        int[] flat = new int[totalLength];
        int idx = 0;
        for (int[] row : arr)
            for (int num : row)
                flat[idx++] = num;

        // Find split points
        int totalSum = Arrays.stream(flat).sum();
        int leftSum = 0;
        boolean found = false;

        System.out.println("\nSplit point(s):");
        for (int i = 0; i < flat.length - 1; i++) {
            leftSum += flat[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                found = true;
                System.out.println("Between index " + i + " and " + (i + 1)
                        + " (Left = " + leftSum + ", Right = " + rightSum + ")");
            }
        }

        if (!found)
            System.out.println("There is no split point.");

        sc.close();
    }
}
