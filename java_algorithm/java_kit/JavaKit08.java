package java_kit;

/**
 * 정수 삼각형
 *     7
 *    3  8
 *   8  1  0
 *  2  7  4  4
 * 4  5  2  6  5
 * 위와 같은 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중
 * 거쳐간 숫자의 합이 가장 큰 경우 찾기
 * 이동은 대각선 바향으로 한 칸 오른쪽 또는 왼쪽으로만 가능 (연결된 노드 느낌)
 * 삼각형 정보가 담긴 배열 triangle 이 매개변수로 주어질 때, 거쳐간 숫자 합 최댓값 return
 * 삼각형 높이는 1 이상 500 이하
 * 삼각형을 이루는 숫자는 0 이상 9,999 이하
 * =====
 * triangle                                               	result
 * [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]	30
 */
public class JavaKit08 {
    public static int solution(int[][] triangle) {
        int answer = triangle[0][0];
        int prevColLen = 1;
        int temp;
        for (int i = 1; i < triangle.length; i++) {
            int colLen = triangle[i].length;

            // 맨 앞
            temp = triangle[i][0] += triangle[i-1][0];
            answer = Math.max(answer, temp);

            // 맨 뒤
            temp = triangle[i][colLen-1] += triangle[i-1][prevColLen - 1];
            answer = Math.max(answer, temp);

            // 중간
            for (int j = 1; j < colLen - 1; j++) {
                temp = triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                answer = Math.max(answer, temp);
            }

            prevColLen = colLen;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(triangle));
    }
}

/*
거꾸로 타고 올라가면 더 간단한 규칙을 세워 풀 수 있음
나는 위에서 내려오는 방식을 생각했는데 ㅠㅠㅠㅠ
아래서 올라가는 방식으로 하면 점화식을 깔끔하게 세울 수 있음!!!
class Solution {
    public int solution(int[][] triangle) {
        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {

                int left = triangle[i][j] + triangle[i+1][j];
                int right = triangle[i][j] + triangle[i+1][j+1];

                triangle[i][j] = Math.max(left, right);
            }
        }

        return triangle[0][0];
    }
}

 */