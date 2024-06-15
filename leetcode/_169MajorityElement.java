package leetcode;

import java.util.HashMap;
import java.util.Map;

// Top Interview 150  > 169. Majority Element
// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
public class _169MajorityElement {
    public int majorityElement(int[] nums) {
        int maxNum = nums[0];

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            int maxCount = counts.getOrDefault(maxNum, 0);

            if (maxCount < count) {
                maxNum = num;
            }

            counts.put(num, count);
        }

        return maxNum;
    }
}
