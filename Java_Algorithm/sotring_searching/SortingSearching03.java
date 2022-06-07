package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 삽입 정렬
 * 앞에서부터 차례대로 이미 정렬된 부분과 비교하여 자신의 자리를 찾아 삽입함으로써 정렬을 완성하는 알고리즘
 */
public class SortingSearching03 {
    public static String solution(int num, int[] nums) {

        for (int i = 1; i < num; i++) {
            int key = nums[i]; // 자리를 찾아야 하는 값

            int j = i - 1; // 자신의 바로 앞부터 비교

            while (j >= 0 && key < nums[j]) { // key 값보다 작아야 key 값이 앞으로 이동 가능
                nums[j + 1] = nums[j]; // 자리를 하나 뒤로 바꿈
                j--; // 앞으로 한 칸이동하여 값 확인함
            }

            nums[j + 1] = key; // nums[j] 값은 key 보다 작음. 즉, key 가 위치해야 하는 위치는 j + 1
        }

        return Arrays.toString(nums).replaceAll("[\\[\\],]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] nums = new int[num];

        for (int idx = 0; idx < num; idx++) {
            nums[idx] = input.nextInt();
        }

        System.out.println(solution(num, nums));
    }
}
