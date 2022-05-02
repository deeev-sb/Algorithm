package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 격자판 최대합
 * N * N 격자판의 각 행의 합, 각 열의 합, 두 대각서의 합 중
 * 가장 큰 합 출력
 * 2 <= N <= 50 이며, 각 줄에는 N개의 자연수가 주어진다.
 * 입력
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * 출력
 * 155
 */
public class Array09 {
    public static int solution(int num, int[][] board) {
        int answer = 0;

        // 가로합
        for (int idx = 0; idx < num; idx++) {
            int sumNums = Arrays.stream(board[idx]).sum();
            answer = Math.max(answer, sumNums);
        }

        // 세로합
        for (int i = 0; i < num; i++) {
            int sumNums = 0;
            for (int j = 0; j < num; j++) {
                sumNums += board[j][i];
            }
            answer = Math.max(answer, sumNums);
        }

        // 대각선합1
        int sumNums = 0;
        for (int i = 0; i < num; i++) {
            sumNums += board[i][i];
        }
        answer = Math.max(answer, sumNums);

        // 대각선합2
        sumNums = 0;
        for (int i = 0; i < num; i++) {
            sumNums += board[i][num - i - 1];
        }
        answer = Math.max(answer, sumNums);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] board = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                board[i][j] = input.nextInt();
            }
        }

        System.out.println(solution(num, board));
    }
}
