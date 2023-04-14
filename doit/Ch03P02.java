package doit;

import java.util.Arrays;
import java.util.Scanner;

/*
BOJ 1546. 평균
중간고사 점수의 최댓값을 M이라 할 때, 모든 점수를 점수/M * 100으로 고쳤다. 이 때의 평균을 구하기.
 */
public class Ch03P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] subjects = new int[size];
        for (int i = 0; i < size; i++) {
            subjects[i] = sc.nextInt();
        }

        System.out.println(solution(size, subjects));
//        System.out.println(doItSolution(size, subjects));
    }

    private static double doItSolution(int size, int[] subjects) {
        long sum = 0;
        long max = 0;
        for (int i = 0;  i < size; i++) {
            if (subjects[i] > max) max = subjects[i];
            sum += subjects[i];
        }

        return sum * 100.0 / max / size;
    }

    private static double solution(int size, int[] subjects) {
        double sum = 0;

        double max = Arrays.stream(subjects).max().orElse(1); // 자료형 주의! int로 하면 올바른 결과를 얻지 못함

        for (int subject : subjects) {
            sum += subject / max * 100;
        }

        return sum / size;
    }

    // stream으로 짜면 짧게 만들 수는 있지만, 위에 코드가 더 메모리와 속도 측면에서 좋다.
    private static double solution2(int size, int[] subjects) {
        double max = Arrays.stream(subjects).max().orElse(0); // 자료형 주의! int로 하면 올바른 결과를 얻지 못함
        return Arrays.stream(subjects).mapToDouble(s -> (s / max * 100)).average().orElse(0.0);
    }
}
