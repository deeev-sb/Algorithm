package doit;

import java.util.Scanner;

/*
BOJ 11659. 구간 합 구하기 4
N개의 수가 주어졌을 때, i번째 수에서 j번째 수까지의 합을 구하기.
 */
public class Ch03P03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int testCase = sc.nextInt();
        int[] sumArray = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            sumArray[i] = sumArray[i - 1] + sc.nextInt();
        }

        for (int t = 0; t < testCase; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(sumArray[j] - sumArray[i - 1]);
        }
    }
}
