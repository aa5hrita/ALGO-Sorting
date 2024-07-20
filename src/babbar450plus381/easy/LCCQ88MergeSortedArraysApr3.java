package src.babbar450plus381.easy;

// Approach 1: Brute Force
// Approach 2: Three Pointers (Start From the Beginning)
// Approach 3: Three Pointers (Start From the End)
public class LCCQ88MergeSortedArraysApr3 {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int end1 = m - 1;
        int end2 = n - 1;

        //use the empty space (=n) of nums1 to fill the largest n numbers of both arrays
        for (int right = m + n - 1; right >= 0; right--) {
            if (end2 < 0)
                break;
            if (end1 >= 0 && (nums1[end1] > nums2[end2])) {
                nums1[right] = nums1[end1];
                end1--;
            } else {
                nums1[right] = nums2[end2];
                end2--;
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
