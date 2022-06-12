package sotring_searching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 중복 확인
 * N명의 학생들이 1부터 10,000,000까지의 숫자 중에서 가장 좋아하는 숫자를 하나 적어서 냈다.
 * N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D를 출력하고,
 * 중복된 숫자가 없으면 U를 출력하라.
 * 입력
 * 8
 * 20 25 52 30 39 33 43 33
 * 출력
 * D
 */
public class SortingSearching05 {
    public static String solution(int students, int[] likeNums) {
        String answer = "U";
        Set<Integer> set = new HashSet<>(); // 적어낸 숫자를 기록함. 중복이 없다면 Size 가 학생 수와 동일하고 중복이 있다면 학생 수보다 Size 가 작음

        for (int idx = 0; idx < students; idx++) {
            set.add(likeNums[idx]);

            if (set.size() < idx + 1) {
                answer = "D";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();
        int[] likeNums = new int[students];

        for (int idx = 0; idx < students; idx++) {
            likeNums[idx] = input.nextInt();
        }

        System.out.println(solution(students, likeNums));
    }
}
