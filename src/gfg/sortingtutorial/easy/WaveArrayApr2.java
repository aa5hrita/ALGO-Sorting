package src.gfg.sortingtutorial.easy;

// Approach 2:  One Pass Optimised
// Comparison of even indexed element with adjacent odds
public class WaveArrayApr2 {

    public static void main(String[] args) {

        int[] arr = new int[]{11, 12, 44, 55, 66, 1, 2, 31, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        // Traverse all even elements i -> 0,2,4,6...
        // odd left = low ; even = peak ; odd right = low
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            if (i > 0 && arr[i - 1] > arr[i]) { // odd left is greater -> make it low
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
            if (i < n - 1 && arr[i + 1] > arr[i]) { // if odd right is greater -> make it low
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        //display array
        for (int element : arr)
            System.out.print(element + ", ");
    }

}
