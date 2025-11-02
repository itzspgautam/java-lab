//Lab 8: Question 1
import java.util.Scanner;
public class Lab8_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int arraySize = sc.nextInt();
//Input array
        int[] arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " Element of array: ");
            arr[i] = sc.nextInt();
        }
//displaying array
        for (int i = 0; i < arraySize; i++) {
            System.out.print(arr[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("\nTotal number of inversion: " + count);
    }
}
