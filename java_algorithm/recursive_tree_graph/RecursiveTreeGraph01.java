package recursive_tree_graph;

import java.util.Scanner;

/**
 * 재귀함수
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 n까지 출력하는 프로그램 작성하기
 * 3 <= N <= 10
 * 3   ->  1 2 3
 */
public class RecursiveTreeGraph01 {
    public static void solution(int cur, int n) {
        if (cur > n) {
            return;
        }

        System.out.print(cur + " ");
        solution(cur+1, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        solution(1, n);
    }
}
