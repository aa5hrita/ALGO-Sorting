package src.sortingAlgos;

import java.util.Arrays;

public class SelectionSortDemo {

    static void sort(int[] arr) {

        int n = arr.length;

        // One by one move boundary of unsorted sub array
        // iterate only till index (n-2) as last element ia automatically sorted
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j; // Find the minimum element (index) in unsorted array

            // Swap the found minimum element with the first element of unsorted sub array
            int temp = arr[min_idx]; //min element
            arr[min_idx] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
