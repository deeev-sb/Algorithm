package twopointers_slidingwindow;

import java.util.Scanner;

/**
 * 연속 부분수열
 * N개의 수로 이루어진 수열이 주어질 때,
 * 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하기
 * N = 8이고, M = 6이면,
 * 1 2 1 3 1 1 1 2
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지 이다.
 * 입력
 * 8 6
 * 1 2 1 3 1 1 1 2
 * 출력
 * 3
 */
public class TwoPointSlidingWindow04 {
    public static int solution(int num, int key, int[] sequence) {
        int answer = 0;
        int point1 = 0;
        int point2 = 0;
        int sum = 0;

        while (point2 < num) {
            if (sum > key) {
                sum -= sequence[point1++];
            } else {
                if (sum == key) {
                    answer++;
                }
                sum += sequence[point2++];
            }
        }

        // while 종료 후 sum 확인 필요
        if (sum == key) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int key = input.nextInt();
        int[] sequence = new int[num];
        for (int idx = 0; idx < num; idx++) {
            sequence[idx] = input.nextInt();
        }

        System.out.println(solution(num, key, sequence));
    }
}
