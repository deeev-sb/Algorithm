package array;

import java.util.Scanner;

/**
 * 점수 계산
 * 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우
 * 가산점을 주기 위해 다음과 같이 점수 계산을 하기로 하였다.
 * 1번 문제가 맞는 경우 1점
 * 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점
 * 연속으로 문제의 답을 맞히는 경우 두 번째 문제는 2점, 세 번째 문제는 3점, ...
 * 틀린 문제는 0점
 * 답이 맞는 경우 1로 표시하고, 틀린 경우 0으로 표시하였을 때
 * 표로 나타내면 아래와 같다.
 * 채점 1 0 1 1 1 0 0 1 1 0
 * 점수 1 0 1 2 3 0 0 1 2 0
 * 입력
 * 10
 * 1 0 1 1 1 0 0 1 1 0
 * 출력
 * 10
 */
public class Array07 {
    public static int solution(int[] score) {
        int answer = 0;
        int continuesCount = 1;
        for (int s : score) {
            if (s == 1) {
                answer += continuesCount++;
            } else {
                continuesCount = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] score = new int[num];

        for (int idx = 0; idx < num; idx++) {
            score[idx] = input.nextInt();
        }

        System.out.println(solution(score));
    }
}
