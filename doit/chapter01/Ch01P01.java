package doit.chapter01;

import java.util.Scanner;

/*
BOJ 2750. 수 정렬하기
N개의 수가 주어졌을 때, 이를 오름차순 하는 프로그램을 작성하시오.
 */
public class Ch01P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        solution(num, array);
    }

    private static void solution(int num, int[] array) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if (array[i] <= array[j]) continue;
                array = swap(array, i, j);
            }
        }

        for (int number : array) {
            System.out.println(number);
        }
    }

    private static int[] swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;
    }
}
