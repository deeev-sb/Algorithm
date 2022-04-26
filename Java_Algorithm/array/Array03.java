package array;

import java.util.Scanner;

/**
 * 가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 N번 할 때, A가 이기면 A 출력, B가 이기면 B 출력, 비기면 D를 출력한다.
 * 가위 바위 보는 1, 2, 3이란느 숫자로 표현한다.
 * 입력
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 * 출력
 * A
 * B
 * A
 * B
 * D
 */
public class Array03 {
    public static String solution(int a, int b) {
        if (a == b) {
            return "D";
        }

        if ((a == 3 && b == 1) || (a == 1 && b == 3)) {
            return a < b ? "A" : "B";
        }

        return a > b ? "A" : "B";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] aInfo = new int[n];
        int[] bInfo = new int[n];

        for (int idx = 0; idx < n; idx++) {
            aInfo[idx] = input.nextInt();
        }

        for (int idx = 0; idx < n; idx++) {
            bInfo[idx] = input.nextInt();
        }

        for (int idx = 0; idx < n; idx++) {
            System.out.println(solution(aInfo[idx], bInfo[idx]));
        }

    }
}
