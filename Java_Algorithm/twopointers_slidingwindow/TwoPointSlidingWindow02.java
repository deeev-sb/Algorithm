package twopointers_slidingwindow;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 공통 원소 구하기
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * 입력
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 * 출력
 * 2 3 5
 */
public class TwoPointSlidingWindow02 {

    public static String solution(int arrayALen, int arrayBLen, int[] arrayA, int[] arrayB) {
        StringBuilder answer = new StringBuilder();
        int point1 = 0, point2 = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        while (point1 < arrayALen && point2 < arrayBLen) {
            if (arrayA[point1] == arrayB[point2]) {
                answer.append(arrayA[point1++]).append(" ");
                point2++;
            } else if (arrayA[point1] > arrayB[point2]) {
                point2++;
            } else {
                point1++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayALen = input.nextInt();
        int[] arrayA = new int[arrayALen];
        for (int idx = 0; idx < arrayALen; idx++) {
            arrayA[idx] = input.nextInt();
        }
        int arrayBLen = input.nextInt();
        int[] arrayB = new int[arrayBLen];
        for (int idx = 0; idx < arrayBLen; idx++) {
            arrayB[idx] = input.nextInt();
        }

        System.out.println(solution(arrayALen, arrayBLen, arrayA, arrayB));
    }
}
