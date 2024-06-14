package leetcode;

import java.util.Arrays;

public class _26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int answer = 1;

        Arrays.sort(nums);

        int preNum = nums[0];
        int size = nums.length;
        int i = 1;
        while (i < size) {
            int num = nums[i];
            if (preNum == num) {
                for (int j = i; j < size - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                size--;
            } else {
                preNum = nums[i];
                answer++;
                i++;
            }
        }
        return answer;
    }
}
