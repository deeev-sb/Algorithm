package dfs_bfs;

import java.util.Scanner;

/**
 * 수열 추측하기
 * 가장 윗줄에 1부터 N까지의 숫자가 한 개씩 적혀있다.
 * 두 번째 줄부터 차례대로 파스칼 삼각형처럼 위 두 개를 더한 값이 저장되게 된다.
 * 예를 들어 N이 4이고 가장 윗 줄이 3 1 2 4가 있다고 했을 때, 아래와 같은 삼각형이 그려진다
 * 3  1  2  4
 * 4  3  6
 * 7 9
 * 16
 * N과 가장 밑에 있는 숫자가 주어졌을 때 가장 윗 줄에 있는 숫자를 구하는 프로그램을 작성하시오
 * 단, 답이 여러가지 나오는 경우에는 사전순으로 가장 앞에 오는 것을 출력한다.
 * 입력
 * 4 16
 * 출력
 * 3 1 2 4
 * ======
 * 1. 수열을 만든다.
 * 2. 파스칼 삼각형 계산 결과를 구한다.
 * 3. 원하는 값이면 출력한다. <- 수열 만드는 과정에서 사전으로 만들어짐
 */
public class DFS_BFS08 {
    static boolean isWant = false;
    static String answer = "";

    public static boolean isWantSequence(int num, int want, int[] visited) {
        int[][] pascal = new int[num][num];
        for (int len = num; len > 0; len--) {
            for (int idx = 0; idx < len; idx++) {
                if (len == num) { // 첫 줄은 채우기
                    pascal[num - len][idx] = visited[idx];
                } else { // 두번째 줄부터는 계산
                    pascal[num - len][idx] = pascal[num - len - 1][idx] + pascal[num - len - 1][idx + 1];
                }
            }
        }

        return pascal[num - 1][0] == want;
    }

    public static void findSequence(int len, int num, int want, int[] visited) {
        if (isWant) return;

        if (len == num) {
            isWant = isWantSequence(num, want, visited);
            if (isWant) {
                for (int idx = 0; idx < num; idx++) {
                    answer += visited[idx] + " ";
                }
            }
            return;
        }

        for (int idx = 0; idx < num; idx++) {
            if (visited[idx] == 0) {
                visited[idx] = len + 1;
                findSequence(len + 1, num, want, visited);
                visited[idx] = 0;
            }
        }
    }

    public static String solution(int num, int want) {
        int[] visited = new int[num]; // 방문 시 현재 len 기록

        findSequence(0, num, want, visited);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int want = input.nextInt();
        System.out.println(solution(num, want));
    }
}