package baekjoon.bronze;

import java.util.Scanner;

public class B11720 { // 숫자의 합

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String nums = sc.next();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            answer += nums.charAt(i) - '0';
        }

        System.out.println(answer);

    }

}
