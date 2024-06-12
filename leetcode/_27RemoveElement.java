package leetcode;

// Top Interview 150  > 27. Remove Element
// https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class _27RemoveElement {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int index = 0;

        while (index < size) {
            if (nums[index] == val) {
                for (int i = index; i < size - 1; i++) {
                    nums[i] = nums[i + 1];
                }
                size--;
            } else {
                index++;
            }
        }

        return index;
    }
}
