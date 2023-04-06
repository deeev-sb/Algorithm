package dfs_bfs;

import java.util.Scanner;

/**
 * 바둑이 승차 (DFS)
 * C 킬로그램을 넘지 않으면서 바둑이들을 태울 수 있는 최대 무게
 * 입력
 * 259 5 // C 킬로그램 바둑이 수
 * 81    // 이 아래로는 각 바둑이 무게
 * 58
 * 42
 * 33
 * 61
 * 출력
 * 242
 */
public class DFS_BFS02 {
    static int answer = 0;

    public static void findMaxWeight(int limitWeight, int curWeight, int curIdx, int dogNum, int[] dogsWeight, boolean[] visited) {
        if (limitWeight < curWeight) {
            return;
        }

        answer = Math.max(answer, curWeight);

        for (int idx = curIdx; idx < dogNum; idx++) {
            if (!visited[idx]) {
                visited[idx] = true;
                findMaxWeight(limitWeight, curWeight + dogsWeight[idx], idx + 1, dogNum, dogsWeight, visited);
                visited[idx] = false;
            }
        }

    }

    public static int solution(int limitWeight, int dogNum, int[] dogsWeight) {
        boolean[] visited = new boolean[dogNum];
        findMaxWeight(limitWeight, 0, 0, dogNum, dogsWeight, visited);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limitWeight = input.nextInt();
        int dogNum = input.nextInt();
        int[] dogsWeight = new int[dogNum];

        for (int idx = 0; idx < dogNum; idx++) {
            dogsWeight[idx] = input.nextInt();
        }

        System.out.println(solution(limitWeight, dogNum, dogsWeight));
    }
}