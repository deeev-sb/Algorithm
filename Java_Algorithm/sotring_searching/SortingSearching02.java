package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 실
 * 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
 */
public class SortingSearching02 {
    public static String solution(int num, int[] nums) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return Arrays.toString(nums).replaceAll("[\\[\\],]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(solution(num, nums));
    }
}
