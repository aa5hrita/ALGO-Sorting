package src.sortingAlgos;

import java.util.Arrays;

public class InsertionSortDemo {


    private static void sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int j = i;

            //BEST CASE: Sorted Array - while loop never runs and hence the TC is O(N)

            while (j > 0 && arr[j - 1] > arr[j]) { //iterate till index 1

                //takes smaller element arr[j] (ASC Order) and places it in it's correct position
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


}
