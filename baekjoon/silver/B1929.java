package baekjoon.silver;

import java.util.Scanner;

public class B1929 { // 소수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt() + 1;
        boolean[] prime = new boolean[n];
        prime[0] = prime[1] = true;

        for (int i = 2; i*i < n; i++) {
            if (!prime[i]) {
                for (int j = i*i; j < n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = m; i < n; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
