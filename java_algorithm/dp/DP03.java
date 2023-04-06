package dp;

import java.util.Scanner;

/**
 * 최대 부분 증가 수열
 * N개의 자연수로 이루어진 수열이 주어졌을 때,
 * 그 중에서 가장 길게 증가하는 원소들의 최대 길이 출력
 * 입력
 * 8
 * 5 3 7 8 6 2 9 4
 * 출력
 * 4
 * ====
 * 1 ~ n 중에 있는 숫자 k라고 할 때,
 * k보다 작은 수들에 대해서 기록하여 최대 길이 구하기
 */
public class DP03 {
    public static int solution(int num, int[] nums) {
        int[] numsLen = new int[num]; // 각 원소들이 가질 수 있는 최대 길이 기록
        int maxLen = 1;
        for (int i = 0; i < num; i++) {
            numsLen[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    numsLen[i] = Math.max(numsLen[i], numsLen[j] + 1);
                    maxLen = Math.max(maxLen, numsLen[i]);
                }
            }
        }

        return maxLen;
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