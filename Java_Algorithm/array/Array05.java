package array;

import java.util.Scanner;

/**
 * 소수 (에라토스테네스 체)
 * 자연수 N이 입력되면 1부터 N 까지의 소스의 개수를 출력하는 프로그램
 * 자연수 개수 N (2 <= N <= 200,000)
 * 입력
 * 20
 * 출력
 * 8
 */
public class Array05 {
    public static int solution(int num) {
        int answer = 0;
        boolean[] isNotPrimeNums = new boolean[num + 1];

        for (int i = 2; i <= num; i++) {
            if (isNotPrimeNums[i]) continue;

            answer++;
            for (int j = i + i; j <= num; j += i) {
                isNotPrimeNums[j] = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(solution(num));
    }
}
