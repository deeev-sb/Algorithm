package twopointers_slidingwindow;

import java.util.Scanner;

/**
 * 최대 매출
 * 매출 기록 중 연속된 K일 동안의 최대 매출액이 얼마인지 구하기
 * N=10이고 10일간 매출 기록이 아래와 같을 때,
 * 12 15 11 20 25 10 20 19 13 15
 * K가 3이면, 3일간 최대 매출액은 11 + 20 + 25 = 56입니다.
 * 입력
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
 * 출력
 * 56
 */
public class TwoPointSlidingWindow03 {
    public static int solution(int recodeDay, int days, int[] recodes) {
        int answer = 0, point1 = 0, point2 = 1;
        int sum = recodes[0];

        while (point2 < recodeDay) {
            if (point2 - point1 == days) {
                sum -= recodes[point1++];
            }
            sum += recodes[point2];
            answer = Math.max(answer, sum);
            point2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int recodeDay = input.nextInt();
        int days = input.nextInt();
        int[] recodes = new int[recodeDay];
        for (int idx = 0; idx < recodeDay; idx++) {
            recodes[idx] = input.nextInt();
        }

        System.out.println(solution(recodeDay, days, recodes));
    }
}
