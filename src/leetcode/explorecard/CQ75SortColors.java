package src.leetcode.explorecard;

import java.util.Arrays;

// Approach: One Pass
public class CQ75SortColors {

    private static void sortColors(int[] nums) {
        int n = nums.length;
        int curr = 0, p0 = 0, p2 = n - 1;
        int temp;

        while (curr <= p2) {
            if (nums[curr] == 0) {
                // swap nums[p0] & nums[curr]
                temp = nums[p0];
                nums[p0] = nums[curr];
                nums[curr] = temp;

                //move ptr p0 to next index (moving in right direction)
                p0++;
                //move curr ptr
                curr++;
            } else if (nums[curr] == 2) {
                // swap nums[p2] & nums[curr]
                temp = nums[p2];
                nums[p2] = nums[curr];
                nums[curr] = temp;

                //move ptr p2 to next index (moving in left direction)
                p2--;
            } else {
                //when nums[curr]=1; do nothing
                curr++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 0, 2, 1, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }


}
