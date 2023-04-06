package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이분검색
 * N개의 숫자가 주어질 때,
 * 오름차순으로 정렬한 다음 특정 수가 몇 번째 위치에 있는지 이분검색으로 찾아내기
 * 입력
 * 8 32
 * 23 87 65 12 57 32 99 81
 * 출력
 * 3
 */
public class SortingSearching08 {
    public static int solution(int numsLen, int key, int[] nums) {
        int keyIdx = 0;
        int left = 0;
        int right = numsLen;

        Arrays.sort(nums); // 오름차순 정렬

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] < key) {
                left = mid;
            } else if (nums[mid] > key) {
                right = mid;
            } else {
                keyIdx = mid;
                break;
            }
        }

        return keyIdx + 1; // 몇 번째인가 이므로 1 더해줘야 함
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numsLen = input.nextInt();
        int key = input.nextInt();
        int[] nums = new int[numsLen];

        for (int idx = 0; idx < numsLen; idx++) {
            nums[idx] = input.nextInt();
        }

        System.out.println(solution(numsLen, key, nums));

    }
}
