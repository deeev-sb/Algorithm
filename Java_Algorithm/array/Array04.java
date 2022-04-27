package array;

import java.util.Scanner;

/**
 * 피보나치 수열
 * 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다
 * n이 7이라고 입력되면 1 1 2 3 5 8 13을 출력한다.
 * n은 3보다 크고 45보다 작다.
 */
public class Array04 {
    public static String solution(int num) {
        int[] fibonacci = new int[num];
        StringBuilder answer = new StringBuilder();
        answer.append("1 1 ");
        fibonacci[0] = fibonacci[1] = 1;
        for (int idx = 2; idx < num; idx++) {
            fibonacci[idx] = fibonacci[idx - 1] + fibonacci[idx - 2];
            answer.append(fibonacci[idx]).append(" ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(solution(num));
    }
}
