package src.sortingAlgos;

import java.util.Arrays;

public class BubbleSortDemo {


    private static void sort(int[] arr) {

        int n = arr.length;
        boolean sorted = true;

        for (int i = n - 1; i >= 0; i--) {
            //don't consider the last element for sorting as it's already the largest(ASC Order)
            //traverse from left and compare adjacent elements till "i"
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    sorted = false; //swapped elements to sort the array
                }
            }
            if (sorted) break;  //improving TC for best case scenarios = O(N)
        }

    }

    private static void bubbleSortOptimised(int[] arr) {
        int n = arr.length;
        boolean unSorted = true;
        // avoids unnecessary checks needed if array gets sorted in the middle of the traversal
        while (unSorted) {
            unSorted = false;
            for (int i = 0; i < n - 1; i++) { // only till n-2
                if (arr[i] > arr[i + 1]) {
                    // swap adjacent elements
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    unSorted = true; //swapped elements to sort the array -> array is unsorted
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        sort(arr);
        bubbleSortOptimised(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
