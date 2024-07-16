package src.gfg.sortingtutorial.easy;

import java.util.Arrays;

// Approach: One pass using the inbuilt sort method
public class WaveArrayApr1 {

    public static void main(String[] args) {

        int[] arr = new int[]{11, 12, 44, 55, 66, 1, 2, 31, 4, 5, 6, 7, 8, 9};

        //sort array
        Arrays.sort(arr); // TC O(N*logN)

        //swap adjacent elements of sorted array
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        //display array
        for (int element : arr)
            System.out.print(element + ", ");
    }

}
