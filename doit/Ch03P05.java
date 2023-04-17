package doit;

import java.util.Scanner;

/*
BOJ 10986. 나머지 합
N개의 수가 주어졌을 때, 연속된 부분 구간 합이 M으로 나누어 떨어지는 구간의 수를 구하라.

 */
public class Ch03P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int divideValue = sc.nextInt();

        long[] array = new long[size + 1];

        for (int i = 1; i <= size; i++) {
            array[i] = array[i - 1] + sc.nextInt();
        }

        System.out.println(doItSolution(size, divideValue, array));
    }

    private static long doItSolution(int size, int divideValue, long[] array) {
        long answer = 0;
        int[] sameRemainderArray = new int[divideValue];

        for (int i = 1; i <= size; i++) {
            int remainder = (int) (array[i] % divideValue);
            if (remainder == 0) answer++;
            sameRemainderArray[remainder]++;
        }

        for (int i = 0; i < divideValue; i++) {
            if (sameRemainderArray[i] > 1)
                answer += (long) sameRemainderArray[i] * (sameRemainderArray[i] - 1) / 2;
        }

        return answer;
    }

    private static long timeOutSolution(int size, int divideValue, long[] array) {
        long answer = 0;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                if ((array[i] - array[j]) % divideValue == 0) answer++;
            }
        }

        return answer;
    }
}
