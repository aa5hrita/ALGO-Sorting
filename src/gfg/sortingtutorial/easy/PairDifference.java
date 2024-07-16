package src.gfg.sortingtutorial.easy;

import java.util.Arrays;

public class PairDifference {

    static boolean findPair(int arr[], int target) {
        int n = arr.length;

        Arrays.sort(arr);

        int i = 0, j = 1;

        // Search for a pair
        while (i < n && j < n) {
            if (i != j && (arr[j] - arr[i] == target || arr[i] - arr[j] == target)) {
                System.out.print("Pair Found: " + "( " + arr[i] + ", " + arr[j] + " )");
                return true;
            }
            i++;
            j++;
        }

        System.out.print("No such pair");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 30, 40, 100};
        int difference = -60;

        findPair(arr, difference);
    }

    
}