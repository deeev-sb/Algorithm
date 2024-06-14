package leetcode;

import java.util.Arrays;

// Top Interview 150  > 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class _80RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);

        int count = 1;
        int size = nums.length;
        int index = 1;
        while(index < size) {
            if (nums[index] == nums[index - 1]) {
                if (count < 2) {
                    count++;
                    index++;
                } else {
                    size--;
                    for (int i = index; i < size; i++) {
                        nums[i] = nums[i + 1];
                    }
                }
            } else {
                count = 1;
                index++;
            }
        }

        return index;
    }
}
