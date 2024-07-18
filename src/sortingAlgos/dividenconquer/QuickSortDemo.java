package src.sortingAlgos.dividenconquer;

import java.util.Arrays;

public class QuickSortDemo {


    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            // pick a pivot and put smaller at left and larger at right
            // & return partition index = pivot's correct place index
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1); //repeat D&C on the left half of the array

            quickSort(arr, partitionIndex + 1, high);  //repeat D&C on the right half of the array
        }

    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low, j = high;
        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {
                i++; // index of first larger element than PIVOT to the right of pivot
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;  // index of first smaller element than PIVOT from the end of array
            }
            if (i < j) {
                //swap smaller & larger elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //place pivot at its correct index(j) and return the index as partition Index
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; //points to pivot's correct index
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 8, 3};
        int lastIndex = arr.length - 1;
        quickSort(arr, 0, lastIndex);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }


}
