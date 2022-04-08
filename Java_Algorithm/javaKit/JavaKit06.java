package javaKit;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 게임 맵 최단거리
 * ROR 게임은 두 팀으로 나누어서 진행하며, 상대 팀 진영을 먼저 파괴하면 이기는 게임
 * 따라서, 각 팀은 상대 팀 진영에 최대한 빨리 도착하는 것이 유리함
 * 5 * 5 크기의 맵에 캐릭터가 (0,0) 위치에 있고, 상대 팀 진영은 (n,m) 위치에 있ㅇㅁ
 * 캐릭터는 동,서,남,북 방향으로 한 칸씩 이동
 * 상대팀 진영에 도착하기 위해서 지나가야 하는 칸의 개수 최솟값 return
 * 단, 상대 팀 진영에 도착할 수 없을 때는 -1 return
 * =====
 * maps 크기는 n * m 이며, n 과 m 은 각각 1 이상 100 이하 자연수
 * n 과 m 은 같을 수도 있고 다를 수도 있지만, 둘 다 1인 경우는 주어지지 않음
 * maps 는 0과 1로 이뤄져 있고, 0은 벽이 있는 자리, 1은 벽이 없는 자리 의미.
 * =====
 * maps	                                                            answer
 * [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]	11
 * [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,0],[0,0,0,0,1]]	-1
 * =====
 * 전형적인 BFS
 */
class Position {
    int row;
    int col;
    int distance;

    Position(int row, int col, int distance) {
        this.row = row;
        this.col = col;
        this.distance = distance;
    }

}

public class JavaKit06 {
    public static int solution(int[][] maps) {
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        int mapsRow = maps.length;
        int mapsCol = maps[0].length;
        boolean[][] visited = new boolean[mapsRow][mapsCol];

        Position position = new Position(0, 0, 1); // 초기값

        Queue<Position> posQueue = new LinkedList<>();
        posQueue.add(position);

        while (!posQueue.isEmpty()) {
            Position curPos = posQueue.poll();
            for (int idx = 0; idx < 4; idx++) {
                int row = curPos.row + drow[idx];
                int col = curPos.col + dcol[idx];
                if (row == (mapsRow - 1) && col == (mapsCol - 1)) {
                    return curPos.distance + 1;
                }

                if (0 <= row && row < mapsRow && 0 <= col && col < mapsCol) {
                    if (maps[row][col] == 0 || visited[row][col]) {
                        continue;
                    }
                    visited[row][col] = true;
                    posQueue.add(new Position(row, col, curPos.distance + 1));

                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][][] maps = {{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}},
                {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}}};

        for (int idx = 0; idx < 2; idx++) {
            System.out.println(solution(maps[idx]));
        }
    }
}