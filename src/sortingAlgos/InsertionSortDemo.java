package src.sortingAlgos;

import java.util.Arrays;

public class InsertionSortDemo {


    private static void sort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int currIndex = i;

            //BEST CASE: Sorted Array - while loop never runs and hence the TC is O(N)

            while (currIndex > 0 && arr[currIndex - 1] > arr[currIndex]) { //iterate till index 1

                //takes smaller element arr[currIndex] (ASC Order) and places it in its correct position
                int temp = arr[currIndex - 1];
                arr[currIndex - 1] = arr[currIndex];
                arr[currIndex] = temp;

                currIndex--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


}
