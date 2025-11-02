//Lab 6: Question 1
public class Lab6_Q1 {
    public static void main(String[] args) {
        int[] arr = {2, 34, 55, 2, 34, 6};
        int length = arr.length;
        boolean[] isVisited = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (isVisited[i] == true) {
                continue;
            }
            int noOfOcc = 1;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    noOfOcc++;
                    isVisited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + noOfOcc + " time.");
        }
    }
}