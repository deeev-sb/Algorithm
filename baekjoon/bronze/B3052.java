package baekjoon.bronze;

import java.util.Scanner;

public class B3052 { // 나머지

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] visited = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt()%42;
            if (!visited[num]) {
                visited[num] = true;
            }
        }

        int cnt = 0;
        for (int i = 0; i < 42; i++) {
            if (visited[i]) cnt++;
        }

        System.out.println(cnt);
    }

}
