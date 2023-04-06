package java_kit;

import java.util.Arrays;

/**
 * 숫자 게임
 * xx 회사의 2 * N 명의 사원들을 두 팀으로 나눠 숫자 게임 진행
 * 숫자 게임 규칙
 * - 모든 사원이 무작위로 자연수를 하나씩 부여받음
 * - 각 사원은 딱 한 번씩 경기
 * - 각 경기당 A 팀에서 한 사원, B 팀에서 한 사원이 나와 서로의 수를 공해
 * - 숫자가 큰족이 승리하며, 승리한 사원이 속한 팀은 승점 1점 얻음
 * - 숫자가 같다면 누구도 승점을 얻지 않음
 * A 팀원들이 부여받은 수가 출전 순서대로 나열된 배열 A 와 i 번째 원소가
 * B 팀원들이 부여받은 수가 출전 순서대로 나열된 배열 B와 i 번째 원소를 비교해
 * B 팀원들이 얻을 수 있는 최대 승점 return
 * => 결론 : B 팀원들이 얻을 수 있는 승점 구하기
 * =====
 * A	         B	        result
 * [5,1,3,7]	[2,2,6,8]	3
 * [2,2,2,2]	[1,1,1,1]	0
 */
public class JavaKit04 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int n = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        int index = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (B[index] > A[i]) {
                index--;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] A = {{5, 1, 3, 7}, {2, 2, 2, 2}};
        int[][] B = {{2, 2, 6, 8}, {1, 1, 1, 1}};
        for (int idx = 0; idx < 2; idx++) {
            System.out.println(solution(A[idx], B[idx]));
        }
    }
}