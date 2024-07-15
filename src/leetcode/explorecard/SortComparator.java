package src.leetcode.explorecard;

import java.util.Arrays;
import java.util.Comparator;

public class SortComparator {

    public static void main(String[] args) {
        String[] stringArray = new String[]{"hello", "world", "we", "are", "learning", "sorting"};
        Arrays.sort(stringArray, new StringCompare());
        System.out.println(Arrays.toString(stringArray));
    }

}

class StringCompare implements Comparator<String> {

    public int compare(String s1, String s2) {
        // Sorts an array of string by length of each string
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }

}