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


    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
