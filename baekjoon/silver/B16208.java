package baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 귀찮음
 * 길이 a1, a2, ..., an 까지 총 n개의 쇠막대가 필요함
 * 하지만 가지고 있는 것은 a1 + a2 + ... + an 길이의 쇠막대 하나
 * 직접 잘라서 필요한 n개의 쇠막대를 만들 때, x + y 길이인 막대를 x, y인 두 개의 막대로 자르면 x * y 만큼의 비용이 듦
 * n개의 쇠막대를 만드는 최소 비용 구하기
 * ===
 * 1 <= n <= 500,000
 * 1 <= ai <= 101
 * ===
 * 입력                          출력
 * 4                             71
 * 3 5 4 2
 * ---
 * 10                            55164
 * 12 43 22 51 2 55 8 21 98 50
 * ===
 * 그리디 알고리즘을 사용하면 쉽게 풀 수 있을 것으로 보임
 * 범위를 만족하기 위해서는 int 형태가 아닌 long 형태로 해야 함
 * int로 돌리면 범위에 대한 오류가 발생함.
 */
public class B16208 {
    public static long solution(int n, int[] needIronRods) {
        long answer = 0;
        long ironRodsLen = Arrays.stream(needIronRods).sum();

        Arrays.sort(needIronRods);

        for (int idx = 0; idx < n - 1; idx++) {
            int needIronRod = needIronRods[idx];
            ironRodsLen -= needIronRod;
            answer += ironRodsLen * needIronRod;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] needIronRods = new int[n];

        for (int idx = 0; idx < n; idx++) {
            needIronRods[idx] = input.nextInt();
        }

        System.out.println(solution(n, needIronRods));
    }
}
