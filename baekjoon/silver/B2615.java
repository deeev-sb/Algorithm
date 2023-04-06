package baekjoon.silver;

import java.util.*;

/**
 * 오목
 * 바둑판에 19개의 가로줄과 19개의 세로줄이 그려져 있을 때,
 * 같은 색의 바둑알이 연속적으로 다섯 알이 놓이면 그 색이 이기게 된다.
 * 여기서 연속적은 가로, 세로 또는 대각선 방향 모두를 뜻한다.
 * 여섯알 이상이 연속적으로 놓인 경우에는 이긴 것이 아니다.
 * 바둑판의 상태가 주어졌을 때, 검은색은 1, 흰색은 2, 알이 놓이지 않은 자리는 0으로 표시된다.
 * 검은색이 이기면 1, 흰색이 이기면 2, 아직 승부가 결정되지 않으면 0을 출력한다.
 * 검은색 또는 흰색이 이겼을 경우 둘째 줄에 연속된 다섯 개의 바둑알 중
 * 가장 왼쪽에 있는 바둑알의 가로줄, 세로줄 번호를 순서대로 출력한다.
 * (연속된 다섯 개의 바둑알이 세로로 놓인 경우, 그 중 가장 위에 있는 것)
 * ===
 * 입력
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 1 2 0 0 2 2 2 1 0 0 0 0 0 0 0 0 0 0
 * 0 0 1 2 0 0 0 0 1 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 1 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 1 2 2 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 2 1 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0
 * ---
 * 출력
 * 1
 * 3 2
 */

class Position {
    int row;
    int col;

    Position(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class B2615 {
    public static List<Position> solution(int[][] board, List<Position> positions, int color) {
        int[][] direction = {{0, 1}, {1, -1}, {1, 0}, {1, 1}};
        int[][] checkDirection = {{0, -1}, {-1, 1}, {-1, 0}, {-1, -1}};
        int count;
        boolean isBreak = false;
        boolean isExistence;
        List<Position> winPosition = null;

        Queue<Position> queue = new LinkedList<>();

        for (Position position : positions) {
            if (isBreak) break;

            for (int i = 0; i < 4; i++) {
                winPosition = new ArrayList<>();
                queue.add(position);
                count = 0;

                while (!queue.isEmpty()) {
                    Position pos = queue.poll();
                    winPosition.add(new Position(pos.row, pos.col));
                    count++;

                    int nextRow = pos.row + direction[i][0];
                    int nextCol = pos.col + direction[i][1];

                    if (0 <= nextRow && nextRow < 19 && 0 <= nextCol && nextCol < 19) {
                        if (board[nextRow][nextCol] == color) {
                            queue.add(new Position(nextRow, nextCol));
                        }
                    }
                }

                if (count == 5) {
                    int checkRow = position.row + checkDirection[i][0];
                    int checkCol = position.col + checkDirection[i][1];

                    isExistence = false;

                    // 오목이 된 시작점 앞에 돌이 있는지 확인하여 육목 이상인지 체크
                    if (0 <= checkRow && checkRow < 19 && 0 <= checkCol && checkCol < 19) {
                        if (board[checkRow][checkCol] == color) {
                            isExistence = true;
                        }
                    }

                    if (!isExistence) {
                        isBreak = true;
                        break;
                    }
                }
            }

        }

        return winPosition;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] board = new int[19][19];
        List<Position> blackPos = new ArrayList<>();
        List<Position> whitePos = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                int temp = input.nextInt();
                board[i][j] = temp;
                if (temp == 1) {
                    blackPos.add(new Position(i, j));
                } else if (temp == 2) {
                    whitePos.add(new Position(i, j));
                }
            }
        }

        List<Position> blackWinPosition = solution(board, blackPos, 1);
        List<Position> whiteWinPosition = solution(board, whitePos, 2);

        if (blackWinPosition != null && blackWinPosition.size() == 5) {
            System.out.println(1);
            blackWinPosition.sort(((o1, o2) -> o1.col - o2.col));
            System.out.println((blackWinPosition.get(0).row + 1) + " " + (blackWinPosition.get(0).col + 1));
        } else if (whiteWinPosition != null && whiteWinPosition.size() == 5) {
            System.out.println(2);
            whiteWinPosition.sort(((o1, o2) -> o1.col - o2.col));
            System.out.println((whiteWinPosition.get(0).row + 1) + " " + (whiteWinPosition.get(0).col + 1));
        } else {
            System.out.println(0);
        }
    }
}
