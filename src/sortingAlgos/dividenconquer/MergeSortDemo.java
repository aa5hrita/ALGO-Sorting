package src.sortingAlgos.dividenconquer;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortDemo {


    private static void mergeSort(int[] arr, int low, int high) {

        if (low == high) return; // base condition for recursive function

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid); // left half

        mergeSort(arr, mid + 1, high); // right half

        merge(arr, low, mid, high); // merge both sorted halves

    }

    private static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> tempSortedArray = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // store elements in the temporary array in a sorted manner
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                tempSortedArray.add(arr[left]);
                left++;
            } else {
                tempSortedArray.add(arr[right]);
                right++;
            }
        }

        // if right is exhausted and push all remaining elements in left
        while (left <= mid) {
            tempSortedArray.add(arr[left]);
            left++;
        }

        // if left is exhausted and push all remaining elements in right
        while (right <= high) {
            tempSortedArray.add(arr[right]);
            right++;
        }

        // transfer all elements from tempSortedArray to original array -> arr
        for (int i = low; i <= high; i++) {
            arr[i] = tempSortedArray.get(i - low); // futuristic for sub array merge sort
        }

    }


    public static void main(String[] args) {
        int[] arr = {5, 55, 1, 4, 23, 66, 52, 40, 32};
        int lastIndex = arr.length - 1;
        mergeSort(arr, 0, lastIndex);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
