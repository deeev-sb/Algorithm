package doit;

import java.util.Scanner;

/*
BOJ 2018. 수들의 합 5
몇 개의 연속된 자연수의 합으로 N을 나타낼 수 있는 방법이 몇 가지인기 구하라.
 */
public class Ch03P06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(solution(number));
    }

    private static int solution(int number) {
        int answer = 1; // number가 15일 때, 15는 number를 나타내느 합이므로 1부터 시작
        int left = 1;
        int right = 2;
        int sum = left + right;

        while (left < right) {
            if (sum < number) {
                sum += ++right;
            } else {
                if (sum == number) {
                    answer++;
                }
                sum -= left++;
            }
        }

        return answer;
    }
}