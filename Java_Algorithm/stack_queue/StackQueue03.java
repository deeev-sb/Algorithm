package stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기 (카카오)
 * 게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만드려고 한다.
 * 게임 규칙은 다음과 같다.
 * 게임 화면은 1 X 1 크기의 칸들로 이루어진 N X N 크기의 정사각 격자이며
 * 위쪽에는 크레인이 있고, 오른쪽에는 바구니가 있다.
 * 모든 인형은 한 칸을 차지하며 격자 가장 아래 칸부터 차곡차곡 쌓여있다.
 * 크레인을 좌우로 움직여서 멈춘 위치의 가장 위에 존재하는 인형을 집어 바구니에 넣으며
 * 바구니에 동일한 인형이 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 사라진다.
 * 인형이 없는 곳에서 크레인을 작동시키는 경우에만 인형을 집지 않는다.
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 출력하라.
 * 입력
 * 5
 * 0 0 0 0 0
 * 0 0 1 0 3
 * 0 2 5 0 1
 * 4 2 4 4 2
 * 3 5 1 3 1
 * 8
 * 1 5 3 5 1 2 1 4
 * 출력
 * 4
 */
public class StackQueue03 {
    public static int solution(int len, int[][] board, int movesCnt, int[] moves) {
        Stack<Integer> bucket = new Stack<>(); // 인형 담을 바구니
        int answer = 0;

        for (int moveIdx = 0; moveIdx < movesCnt; moveIdx++) {
            int position = moves[moveIdx] - 1;

            for (int idx = 0; idx < len; idx++) {
                int doll = board[idx][position];
                if (doll != 0) {
                    if (!bucket.isEmpty() && bucket.peek() == doll) {
                        bucket.pop();
                        answer++;
                    } else {
                        bucket.push(doll);
                    }
                    board[idx][position] = 0;
                    break;
                }
            }
        }

        return answer * 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[][] board = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = input.nextInt();
            }
        }
        int movesCnt = input.nextInt();
        int[] moves = new int[movesCnt];
        for (int idx = 0; idx < movesCnt; idx++) {
            moves[idx] = input.nextInt();
        }

        System.out.println(solution(len, board, movesCnt, moves));
    }
}