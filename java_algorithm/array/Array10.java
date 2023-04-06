package array;

import java.util.Scanner;

/**
 * 봉우리
 * 지도 정보가 N * N 격자판에 주어질 때,
 * 각 격자에는 그 지역의높이가 쓰여 있다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역이며,
 * 봉유리 지역이 몇 개 있는지 출력하라.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정.
 * 2 <= N <= 50, 각 줄에는 N개의 자연수가 주어지며 각 자연수는 100을 넘지 않는다.
 * 입력
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * 출력
 * 10
 */
public class Array10 {
    public static int solution(int num, int[][] board) {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        boolean isPeak;
        int answer = 0;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int boardNum = board[i][j];
                isPeak = true;
                for (int k = 0; k < 4; k++) {
                    int nr = i + dr[k];
                    int nc = j + dc[k];

                    if (0 <= nr && nr < num && 0 <= nc && nc < num && board[nr][nc] >= boardNum) {
                        isPeak = false;
                        break;
                    }
                }

                if (isPeak) {
                    answer++;
                }

            }
        }

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
