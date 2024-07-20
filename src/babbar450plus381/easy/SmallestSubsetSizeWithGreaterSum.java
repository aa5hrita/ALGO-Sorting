package src.babbar450plus381.easy;

import java.util.Arrays;

//Approach: Sorting (Greedy Approach)
public class SmallestSubsetSizeWithGreaterSum {

    static int minElements(int[] arr, int n) {
        int halfSum = 0, minSize = 0, curr_sum = 0;

        // Calculating HALF of whole array sum
        for (int i = 0; i < n; i++)
            halfSum = halfSum + arr[i];
        halfSum = halfSum / 2;

        // Sort the array in ascending order
        Arrays.sort(arr);

        // start traversing array from the end
        for (int i = n - 1; i >= 0; i--) {

            curr_sum += arr[i];
            minSize++;

            // check if current sum is greater than halfSum
            if (curr_sum > halfSum)
                return minSize;
        }
        return minSize;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 1};
        int n = arr.length;
        System.out.println(minElements(arr, n));
    }

}
