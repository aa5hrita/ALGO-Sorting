package src.gfg.sortingtutorial.easy;

import java.util.Arrays;

// Approach: Bubble sort by comparing first char of each string
public class SortStringsArrayBubbleSort {

    private static void sortStringArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    // swap both the strings
                    // if first string has higher ascii value than second string
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //Note: first char of all string must be Captical Letters
        String[] stringsArray = new String[]{"GeeksforGeeks", "Quiz",
                "Practice", "Gblogs", "Master", "Coding", "Love", "Animals"};
        sortStringArray(stringsArray);
        System.out.println(Arrays.toString(stringsArray));
    }
}
