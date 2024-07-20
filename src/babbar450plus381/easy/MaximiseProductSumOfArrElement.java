package src.babbar450plus381.easy;

import java.util.Arrays;

// Approach: Brute Force
public class MaximiseProductSumOfArrElement {
    
    private static int maxSum(int arr[], int n) {
        int mod = 1000000007;

        // Sorting the array in ascending order
        Arrays.sort(arr);

        long ans = 0;

        // Calculating the sum of product of each element with its index
        // and taking modulo to avoid overflow
        for (int i = 0; i < n; i++)
            ans = (ans + ((long) arr[i] * i) % mod) % mod;

        return (int) ans;

    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 1};
        int n = arr.length;

        System.out.println(maxSum(arr, n));
    }
}
