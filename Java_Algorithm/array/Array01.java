package array;

import java.util.Scanner;

/* 큰 수 출력하기
n개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램
6               -> 7 9 6 12
7 3 9 5 6 12
 */
public class Array01 {
    public static StringBuilder solution(int num, int[] nums) {
        StringBuilder answer = new StringBuilder();
        answer.append(nums[0]);
        for (int idx = 1; idx < num; idx++) {
            if (nums[idx] > nums[idx - 1]) {
                answer.append(" ").append(nums[idx]);
            }
        }

        return answer;
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
