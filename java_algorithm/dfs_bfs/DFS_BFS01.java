package dfs_bfs;

import java.util.Scanner;

/**
 * 합이 같은 부분 집합 (DFS : 아마존 인터뷰)
 * N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분 집합으로 나누었을 때
 * 두 부분 집합의 원소의 합이 서로 같은 경우가 존재하면 "YES" 출력, 아니면 "NO" 출력
 * 입력
 * 6
 * 1 3 5 6 7 10
 * 출력
 * YES
 */
public class DFS_BFS01 {
    static String answer = "NO";

    public static void findSame(int n, int len, int cur, int num, int[] nums, boolean[] visited) {
        if (len == n) {
            int temp1 = 0;
            int temp2 = 0;
            for (int idx = 0; idx < num; idx++) {
                if (visited[idx]) {
                    temp1 += nums[idx];
                } else {
                    temp2 += nums[idx];
                }
            }

            if (temp1 == temp2) {
                answer = "YES";
            }
            return;
        }

        for (int idx = cur; idx < num; idx++) {
            if (!visited[idx]) {
                visited[idx] = true;
                findSame(n, len + 1, idx + 1, num, nums, visited);
                visited[idx] = false;
            }
        }
    }

    public static String solution(int num, int[] nums) {
        for (int n = 1; n <= num / 2; n++) {
            boolean[] visited = new boolean[num];
            findSame(n, 0, 0, num, nums, visited);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] nums = new int[num];
        for (int idx = 0; idx < num; idx++) {
            nums[idx] = input.nextInt();
        }

        System.out.println(solution(num, nums));
    }
}