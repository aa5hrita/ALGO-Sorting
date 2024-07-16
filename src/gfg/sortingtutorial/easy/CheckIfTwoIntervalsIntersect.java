package src.gfg.sortingtutorial.easy;

import java.util.Arrays;
import java.util.Comparator;

// Approach 1: Using sorting
// Brute Force: Nested for loop, consider every pair of intervals and check if the pair intersects or not
// TC = O(N^2)
public class CheckIfTwoIntervalsIntersect {

    private static boolean isIntersect(Interval arr[]) {
        int n = arr.length;

        // Sort intervals in increasing order of start time
        Arrays.sort(arr, Comparator.comparingInt(interval -> interval.start));

        // In the sorted array, if start time of an interval
        // is less than end of previous interval, then there
        // is an overlap
        for (int i = 1; i < n; i++)
            if (arr[i - 1].end > arr[i].start)
                return true;

        // If we reach here, then no overlap
        return false;
    }

    public static void main(String[] args) {
        Interval intervalsArray[] = {new Interval(1, 3),
                new Interval(7, 9),
                new Interval(4, 6),
                new Interval(10, 13)};

        System.out.println("Arr1 Intersection: " + isIntersect(intervalsArray));

        Interval intervalsArray2[] = {new Interval(6, 8),
                new Interval(1, 3),
                new Interval(2, 4),
                new Interval(4, 7)};

        System.out.println("Arr2 Intersection: " + isIntersect(intervalsArray2));
    }

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}