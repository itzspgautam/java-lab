//Lab 6: Question 4
public class Lab6_Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 8, 4, 3, 2, 3, 3}; 
        boolean canSplit = false;
        // find total sum
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int leftSum = 0;
        // check for split position
        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                canSplit = true;
                System.out.println("True!! The array can be split in a position where the sum of both sides are equal.");
                System.out.println("Splitting position is between index " + i + " and " + (i + 1));
                System.out.println("Sum of left side: " + leftSum);
                System.out.println("Sum of right side: " + rightSum);
                break;
            }
        }
        if (!canSplit) {
            System.out.println("False!! The array cannot be split at any position where the sum of both sides are equal.");
        }
    }
}
