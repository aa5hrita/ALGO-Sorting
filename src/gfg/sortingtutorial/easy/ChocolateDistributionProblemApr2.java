package src.gfg.sortingtutorial.easy;

import java.util.Arrays;

// Approach 1: Brute Force (3nested for loop)
// Approach 2: Use Sorting (efficient)
public class ChocolateDistributionProblemApr2 {

    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;

        int result = chocolateDistribution(arr, m);

        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }

    private static int chocolateDistribution(int[] arr, int m) {
        if (arr.length == 0 || m == 0) {
            return 0;
        }

        Arrays.sort(arr);  // Sort the array to simplify calculations

        // Check if there are enough packets for the given number of students
        if (arr.length - 1 < m) {
            return -1;    // Invalid input
        }

        int min_diff = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum difference
        for (int i = 0; i < arr.length; i++) {

            int nextWindow = i + m - 1;  // Calculate the ending index of the current window

            if (nextWindow >= arr.length)
                break; // Break if the window goes beyond the bounds of the array

            // Calculate the difference between the last and first elements in the window
            int diff = arr[nextWindow] - arr[i];

            // Update the minimum difference if a smaller difference is found
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }


}
