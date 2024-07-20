package src.babbar450plus381.easy;


// Approach 1: Brute Force
// Approach 2: One Pass | DNF Approach
public class ThreeWayPartitionApr2 {

    private static int[] threeWayPartition(int[] array, int low, int high) {

        int n = array.length;
        int start = 0, end = n - 1;

        for (int currIndex = 0; currIndex <= end; ) {

            if (array[currIndex] < low) {
                int temp = array[currIndex];
                array[currIndex] = array[start];
                array[start] = temp;
                start++;
                currIndex++;
            } else if (array[currIndex] > high) {
                int temp = array[currIndex];
                array[currIndex] = array[end];
                array[end] = temp;
                end--;
            } else
                currIndex++;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

        System.out.println("Modified array: ");

        for (int x : threeWayPartition(arr, 10, 20)) {
            System.out.print(x + " ");
        }
    }

}
