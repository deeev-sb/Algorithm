package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 멘토링
 * M번의 수학테스트 등수를 기반으로 멘토와 멘티를 정함
 * A 학생이 M 번의 수학테스트에서 B 학생을 모두 앞서야 멘토가 될 수 있음
 * 학생 수 N은 1 <= N <= 20, 수학테스트 M은 1 <= M <= 10
 * 입력
 * 4 3
 * 3 4 1 2
 * 4 3 2 1
 * 3 1 4 2
 * 출력
 * 3
 * ===
 * 뒤에 있는 모든 숫자의 멘토가 가능함.
 */
public class Array12 {
    public static int solution(int n, int m, int[][] testResult) {
        int[][] isNotMentor = new int[n][n]; // 가능 1 불가능 2
        int answer = 0;

        for (int test = 0; test < m; test++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int cur = testResult[test][i] - 1;
                    int next = testResult[test][j] - 1;
                    if (isNotMentor[cur][next] != 2) isNotMentor[cur][next] = 1;
                    isNotMentor[next][cur] = 2;
                }
            }
        }

        for (int idx = 0; idx < n; idx++) {
            answer += Arrays.stream(isNotMentor[idx]).filter(value -> value == 1).count();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] testResult = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                testResult[i][j] = input.nextInt();
            }
        }

        System.out.println(solution(n, m, testResult));

    }
}
