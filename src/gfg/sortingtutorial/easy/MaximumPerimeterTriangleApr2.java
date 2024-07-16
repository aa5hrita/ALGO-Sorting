package src.gfg.sortingtutorial.easy;

import java.util.Arrays;
import java.util.Collections;

// Approach 1: Brute Force -> O(N3) & 0(1)
// Approach 2: Use Sorting -> O(N logN) &  0(1)
public class MaximumPerimeterTriangleApr2 {

    private static void maxPerimeter(Integer[] arr) {

        int n = arr.length;
        int maxPerimeter = 0;
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                maxPerimeter = Math.max(maxPerimeter, arr[i] + arr[i + 1] + arr[i + 2]);
                break;
            }
        }

        if (maxPerimeter > 0) {
            System.out.println("Maximum Perimeter is: " + maxPerimeter);
        } else {
            // otherwise no triangle formation is possible
            System.out.println("Triangle formation is not possible.");
        }

    }


    public static void main(String[] args) {
        Integer[] arr1 = {6, 1, 6, 5, 8, 4};
        maxPerimeter(arr1);
    }

}
