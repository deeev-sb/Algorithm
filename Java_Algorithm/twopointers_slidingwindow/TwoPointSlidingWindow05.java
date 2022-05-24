package twopointers_slidingwindow;

import java.util.Scanner;

/**
 * 연속된 자연수의 합
 * 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로
 * 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 입력
 * 15
 * 출력
 * 3
 */
public class TwoPointSlidingWindow05 {
    public static int solution(int num) {
        int answer = 0;
        int point1 = 1;
        int point2 = 2;
        int sum = point1 + point2;

        while (point1 <= num / 2) {
            if (sum < num) {
                sum += ++point2;
            } else if (sum > num) {
                sum -= point1++;
            } else {
                answer++;
                sum += ++point2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(solution(num));
    }
}
