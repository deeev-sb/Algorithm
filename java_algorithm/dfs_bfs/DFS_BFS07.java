package dfs_bfs;

import java.util.Scanner;

/**
 * 조합의 수
 * nCr = n-1Cr-1 + n-1Cr 공식을 사용하여 재귀를 이용해 조합수를 구하는 프로그램을 작성하라
 * 입력
 * 5 3
 * 출력
 * 10
 */
public class DFS_BFS07 {

    public static int solution(int n, int r) {
        int answer = 0;

        if (n == r) return 1;
        if (r == 1) return n;

        answer += solution(n - 1, r - 1) + solution(n - 1, r);

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        System.out.println(solution(n, r));
    }
}