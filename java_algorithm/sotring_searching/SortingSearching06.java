package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 장난꾸러기
 * N명의 학생에 대해 키가 작은 학생순으로 1번부터 N 번까지 반 번호를 부여한다.
 * 철수는 짝꿍보다 키가 큰데, 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨고 그 순서대로 번호가 부여되었다.
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때
 * 철수가 받은 번호와 철수 짝꿍이 받은 번호를 차례로 출력하라
 */
public class SortingSearching06 {
    public static String solution(int students, int[] studentHeights) {
        StringBuilder answer = new StringBuilder();
        int[] rightStudentHeights = Arrays.stream(studentHeights).sorted().toArray(); // 올바른 키 순서

        for (int idx = 0; idx < students; idx++) {
            if (studentHeights[idx] != rightStudentHeights[idx]) {
                answer.append((idx + 1)).append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();
        int[] studentHeights = new int[students];

        for (int idx = 0; idx < students; idx++) {
            studentHeights[idx] = input.nextInt();
        }

        System.out.println(solution(students, studentHeights));
    }
}
