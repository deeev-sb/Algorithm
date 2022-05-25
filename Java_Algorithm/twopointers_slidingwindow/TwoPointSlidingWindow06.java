package twopointers_slidingwindow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 수열이 주어질 때,
 * 최대 k번을 0을 1로 변경할 수 있다.
 * 최대 k번의 변경을 통해 이 수열에서 1로만 구성된
 * 연속부분수열의 최대 길이를 찾기
 * 입력
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 출력
 * 8
 */
public class TwoPointSlidingWindow06 {
    public static int solution(int len, int k, int[] array) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        int sum = 0; // 연속 부분 수열 길이 기록
        for (int idx = 0; idx < len; idx++) {
            if (array[idx] == 0) {
                if (queue.size() >= k) {
                    answer = Math.max(answer, sum);
                    sum = idx - queue.poll() - 1;
                }
                queue.add(idx);
            }
            sum++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int k = input.nextInt();
        int[] array = new int[len];

        for (int idx = 0; idx < len; idx++) {
            array[idx] = input.nextInt();
        }

        System.out.println(solution(len, k, array));
    }
}
