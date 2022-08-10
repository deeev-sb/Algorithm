package array;

import java.util.*;

/**
 * 임시반장 정하기
 * 1학년부터 5학년까지 지내오면서 한 번이라도 같은 반이었던 사람이 가장 많은 학생이 임시반장
 * 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어지며, 학생 수는 3 이상 1000 이하
 * 둘째 줄부터는 1번 학생부터 차례로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지
 * 주어지는 정수는 1 이상 9 이하
 * 임시 반장이 될 수 있는 학생이 여러 명인 경우 그 중 가장 작은 번호만 출력
 * 입력
 * 5
 * 2 3 1 7 3
 * 4 1 9 6 8
 * 5 5 2 4 4
 * 6 5 2 6 7
 * 8 4 2 2 2
 * 출력
 * 4
 * ===
 * 뭔가 상당히 이상하게 푼 것 같음. 강의 확인 필요.
 */
public class Array11 {
    public static int solution(int num, int[][] studentsInfo) {
        Map<Integer, List<Integer>> sameClass = new HashMap<>(); // 같은 반을 한 적이 있는 학생 정보
        int[] maxSame = {0};
        int[] maxSameStudent = {0};

        for (int grade = 0; grade < 5; grade++) {
            Map<Integer, List<Integer>> classInfo = new HashMap<>(); // 각 학년 별 교실 정보
            for (int idx = 0; idx < num; idx++) {
                int studentClass = studentsInfo[idx][grade];

                List<Integer> classList = classInfo.getOrDefault(studentClass, new ArrayList<>());
                classList.add(idx);
                classInfo.put(studentClass, classList);
            }

            classInfo.keySet().forEach(key -> {
                List<Integer> classList = classInfo.get(key);
                if (classList.size() > 1) {
                    for (int i = 0; i < classList.size(); i++) {
                        for (int j = 0; j < classList.size(); j++) {
                            if (i == j) continue;
                            List<Integer> same = sameClass.getOrDefault(classList.get(i), new ArrayList<>());
                            if (!same.contains(classList.get(j))) {
                                same.add(classList.get(j));
                                sameClass.put(classList.get(i), same);
                            }
                        }
                    }
                }
            });

            sameClass.keySet().forEach(key -> {
                int size = sameClass.get(key).size();
                if (maxSame[0] < size) {
                    maxSame[0] = size;
                    maxSameStudent[0] = key;
                }
            });

        }

        return maxSameStudent[0] + 1;
    }

    private static int answerSolution(int num, int[][] studentsInfo) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) { // i 친구
            int cnt = 0;
            for (int j = 0; j < num; j++) { // j 친구
                for (int k = 0; k < 5; k++) { // 학년
                    if (studentsInfo[i][k] == studentsInfo[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] studentsInfo = new int[num][5];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 5; j++) {
                studentsInfo[i][j] = input.nextInt();
            }
        }

        System.out.println(solution(num, studentsInfo));

        System.out.println(answerSolution(num, studentsInfo));

    }
}
