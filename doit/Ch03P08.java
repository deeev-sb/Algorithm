package doit;

import java.util.Arrays;
import java.util.Scanner;

/*
BOJ 1253. 좋다

N개의 수 중 다른 두 개의 수 합으로 나타낼 수 있다면 좋은 수이다.
N개의 수가 주어질 때, 그 중 좋은 수의 개수는 몇 개인지 추력하라.
수의 위치가 다르면 값이 같아도 다른 수이다.

> 풀이 참고해서 풀었음
 */
public class Ch03P08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] numbers = new long[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(solution(size, numbers));
    }

    private static long solution(int size, long[] numbers) {
        long answer = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < size; i++) {
            int left = 0;
            int right = size - 1;
            long number = numbers[i];
            while (left < right) {
                long sum = numbers[left] + numbers[right];
                if (sum < number) {
                    left++;
                } else if (sum > number) {
                    right--;
                } else {
                    if (left != i && right != i) { // 다른 두 개의 수 합 (left와 right는 같을 수 없음)
                        answer++;
                        break;
                    } else if (left == i) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return answer;
    }
}
