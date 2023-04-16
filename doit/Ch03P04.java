package doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
BOJ 11660. 구간 합 구하기 5
N x N 크기의 표에 수가 채워져 있을 때, 표 안의 (X1, Y1)에서 (X2, Y2)까지의 사각형 합을 구하려한다.
다음과 같이 표가 주어질 때,
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
(2, 2)에서 (3, 4) 까지의 합을 구하면,
3 + 4 + 5 + 4 + 5 + 6 = 27
이다.
 */
public class Ch03P04 {
    public static void main(String[] args) throws IOException {
        doItSolution();
    }

    // DoIt에 나온 풀이와 비교 -> 다른 건 입력 받는 부분 밖에 없었다... :( 참고로, Scanner 보다 BufferReader 가 더 빠르다.
    private static void doItSolution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int testCase = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[size + 1][size + 1];

        // (1, 1)부터 사각형 구간 합 matrix 생성
        for (int i = 1; i <= size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= size; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(matrix[x2][y2] - matrix[x1 - 1][y2] - matrix[x2][y1 - 1] + matrix[x1 - 1][y1 - 1]);
        }
    }

    // 입력을 Scanner로 받아오면 타임 아웃이 발생한다 ㅠㅠ
    private void timeOutSolution2() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int testCase = sc.nextInt();

        int[][] matrix = new int[size + 1][size + 1];

        // (1, 1)부터 사각형 구간 합 matrix 생성
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1] + sc.nextInt();
            }
        }

        for (int t = 0; t < testCase; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.println(matrix[x2][y2] - matrix[x1 - 1][y2] - matrix[x2][y1 - 1] + matrix[x1 - 1][y1 - 1]);
        }
    }

    private void timeOutSolution() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int testCase = sc.nextInt();

        int[][] matrix = new int[size + 1][size + 1];

        // 가로 기준 구간 합 matrix 생성
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                matrix[i][j] = matrix[i][j - 1] + sc.nextInt();
            }
        }

        for (int t = 0; t < testCase; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int answer = 0;
            for (int i = x1; i <= x2; i++) {
                answer += matrix[i][y2] - matrix[i][y1 - 1];
            }

            System.out.println(answer);
        }
    }
}
