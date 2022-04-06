package dp;

import java.util.Scanner;

/**
 * 계단오르기
 * 계단을 한 번에 한 계단 또는 두 계단씩 올라갈 때, 총 4계단을 오르는 방법은 5가지이다.
 * 이런 식으로 n개의 계단에 대해 올라갈 수 있는 방법이 몇 가지 있는지 구하기.
 * 7    ->    21
 * =====
 * 4계단일 때
 * 1  2  3  4
 * 1  2  3  5
 * n이 4면 (n-1) + (n-2)
 * 7계단일 때로 확인해보자
 * 1  2  3  4  5   6   7
 * 1  2  3  5  8  13  21
 */
public class DP01 {
    public static int solution(int numberOfStairs) {
        int[] wayToClimbStairs = new int[numberOfStairs];

        if (numberOfStairs == 1) {
            return 1;
        } else if (numberOfStairs == 2) {
            return 2;
        } else {
            wayToClimbStairs[0] = 1;
            wayToClimbStairs[1] = 2;

            for (int idx = 2; idx < numberOfStairs; idx++) {
                wayToClimbStairs[idx] = wayToClimbStairs[idx-1] + wayToClimbStairs[idx-2];
            }

            return wayToClimbStairs[numberOfStairs-1];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStairs = input.nextInt();
        System.out.println(solution(numberOfStairs));
    }
}
