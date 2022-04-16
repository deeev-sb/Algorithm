package Baekjoon.Silver;

import java.util.Scanner;

/**
 * 계단 오르기
 * 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임
 * 각 계단에는 일정한 점수가 쓰여 있는데, 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻음
 * 게임 규칙
 * 1. 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
 * 2. 연속된 세 개의 계단을 모두 밟아서는 안된다.
 * 3. 마지막 도착 계단은 반드시 밟아야 한다. <- 이 조건을 만족하려면?
 * 얻을 수 있는 가장 큰 점수 구하기
 * ---
 * 연속되지 않게 구하려면
 * 현재 계단 위치가 K라고 할 때
 * K - 1 계단 점수 + K - 3까지의 총 점수와
 * K - 2까지의 총 점수를 비교한다.
 */
public class B2579 {
    public static int solution(int stepLen, int[] stepsPoint) {
        int[] stepsScore = new int[stepLen];
        if (stepLen > 0)
            stepsScore[0] = stepsPoint[0];
        if (stepLen > 1)
            stepsScore[1] = stepsPoint[1] + stepsPoint[0];
        if (stepLen > 2)
            stepsScore[2] = stepsPoint[2] + Math.max(stepsPoint[0], stepsPoint[1]);
        if (stepLen > 3) {
            for (int i = 3; i < stepLen; i++) {
                stepsScore[i] = stepsPoint[i] + Math.max(stepsPoint[i-1] + stepsScore[i-3], stepsScore[i-2]);
            }
        }
        return stepsScore[stepLen-1];
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int stepLen = input.nextInt();
        int[] stepsPoint = new int[stepLen];

        for (int i = 0; i < stepLen; i++) {
            stepsPoint[i] = input.nextInt();
        }

        System.out.println(solution(stepLen, stepsPoint));
    }
}
