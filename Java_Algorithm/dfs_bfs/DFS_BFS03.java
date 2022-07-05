package dfs_bfs;

import java.util.Scanner;

/**
 * 최대점수 구하기 (DFS)
 * 제한시간 M 안에 N개의 문제 중 일부를 풀었을 때 얻을 수 있는 최대 점수
 * 입력은 문제 개수 N, 제한시간 M과 N 줄에 걸쳐 얻을 수 점수와 푸는 데 걸리는 시간이 주어짐
 * 입력
 * 5 20
 * 10 5
 * 25 12
 * 15 8
 * 6 3
 * 7 4
 * 출력
 * 41
 */
public class DFS_BFS03 {
    static int answer = 0;

    public static void findMaxScore(int curIdx, int curScore, int curTime, int problems, int limitTime, int[][] solvedInfo, boolean[] visited) {
        if (limitTime < curTime) {
            return;
        }

        answer = Math.max(answer, curScore);

        for (int idx = curIdx; idx < problems; idx++) {
            if (!visited[idx]) {
                visited[idx] = true;
                findMaxScore(idx, curScore + solvedInfo[idx][0], curTime + solvedInfo[idx][1], problems, limitTime, solvedInfo, visited);
                visited[idx] = false;
            }
        }

    }

    public static int solution(int problems, int limitTime, int[][] solvedInfo) {
        boolean[] visited = new boolean[problems];
        for (int idx = 0; idx < problems; idx++) {
            findMaxScore(idx, 0, 0, problems, limitTime, solvedInfo, visited);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int problems = input.nextInt();
        int limitTime = input.nextInt();
        int[][] solvedInfo = new int[problems][2];

        for (int idx = 0; idx < problems; idx++) {
            solvedInfo[idx][0] = input.nextInt(); // 점수
            solvedInfo[idx][1] = input.nextInt(); // 시간
        }

        System.out.println(solution(problems, limitTime, solvedInfo));
    }
}