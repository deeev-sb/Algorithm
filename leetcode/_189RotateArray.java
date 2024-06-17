package leetcode;

// Top Interview 150  > 189. Rotate Array
// https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
public class _189RotateArray {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int[] copy = new int[size];
        k = k % size;

        for (int i = 0; i < size; i++) {
            int moveIndex = i + k < size ? i + k : (i + k) - size;
            copy[moveIndex] = nums[moveIndex]; // 값 옮기기
            if (i < k) {
                nums[moveIndex] = nums[i];
            } else {
                nums[moveIndex] = copy[i];
            }
        }
    }
}
