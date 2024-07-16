package src.gfg.sortingtutorial.easy;

import java.util.Arrays;

// JAVA program to check whether two strings are anagrams of each other
// Other Approach: Frequency Counting using CountArr[256] or HashMap -> both give (O(n), O(1))
// Approach: Using sorting
public class CheckTwoStringsAreAnagrams {

    static boolean areAnagrams(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same, then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        // char[] str1 = {'g', 'r', 'a', 'm'};
        // char[] str2 = {'a', 'r', 'm'};

        char[] str1 = ("silent").toCharArray();
        char[] str2 = ("listen").toCharArray();

        if (areAnagrams(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }


}
