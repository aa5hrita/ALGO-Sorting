package src.babbar450.easy;

// Approach 1: Brute Force
// Approach 2: Three Pointers (Start From the Beginning)
public class LCCQ88MergeSortedArraysApr2 {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        // Make a copy of the first m elements of nums1.
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }

        // Read pointers for nums1Copy and nums2 respectively.
        int start1 = 0;
        int start2 = 0;

        // Compare elements from nums1Copy and nums2 and write the smallest into nums1.
        for (int i = 0; i < m + n; i++) {

            // We also need to ensure that start1 and start2 aren't over their boundaries
            if (start2 >= n || (start1 < m && nums1Copy[start1] < nums2[start2])) {
                nums1[i] = nums1Copy[start1++];
            } else {
                nums1[i] = nums2[start2++];
            }

        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 4, 5, 7, 8, 77, 0, 0, 0, 0, 0, 0, 0, 0};
        int m = 7;
        int n = 8;
        int[] nums2 = new int[]{1, 2, 3, 8, 14, 15, 44, 99};
        for (int i : merge(nums1, m, nums2, n)) {
            System.out.print(i + ", ");
        }
    }

}
