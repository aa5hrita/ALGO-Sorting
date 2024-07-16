package src.gfg.sortingtutorial.easy;

import java.util.Arrays;
import java.util.Collections;

// Program to sort even-placed elements in increasing and
// odd-placed in decreasing order with constant space complexity
// Approach 1: Brute Force (SC -> O(N))
// Approach 2: Use Swapping (optimised)
public class BitonicGeneratorApr2 {

    static void bitonicGenerator(Integer[] arr) {

        int n = arr.length;

        int i = 1; // first odd index

        int j = n - 1;   // last index

        // if last index is odd
        if (j % 2 != 0)
            j--;  // decrement j to even index

        // swapping till half of array
        while (i < j) {
            swap(arr, i, j);
            i += 2;
            j -= 2;
        }

        // Sort first half (all even indexed elements) in increasing
        Arrays.sort(arr, 0, (n + 1) / 2); //toIndex is exclusive

        // Sort second half (all odd indexed elements) in decreasing
        Arrays.sort(arr, (n + 1) / 2, n, Collections.reverseOrder()); //toIndex is exclusive

    }

    static void swap(Integer[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        // Integer[] coz Collection.reverseOrder() works on Object[] only
        Integer[] arr = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0};

        bitonicGenerator(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }

    
}
