package hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

/* 학급 회장 (해쉬)
학급 회장 후보 A, B, C, D, E
반 학생 N명과 어떤 후보를 투표했는지가 적힌 N개의 투표용지가 있음
어떤 후보가 학급 회장이 되었는지 출력
15                -> C
BACBACCACCBDEDE
 */
public class HashMapTreeSet01 {
    public static String solution(String[] ballotPapers) {
        // 후보 목록 생성
        HashMap<String, Integer> candidate = new HashMap<>();
        candidate.put("A", 0);
        candidate.put("B", 0);
        candidate.put("C", 0);
        candidate.put("D", 0);
        candidate.put("E", 0);

        // 후보 이름이 나올 때마다 투표 수 추가
        for (String ballotPaper : ballotPapers) {
            candidate.put(ballotPaper, candidate.get(ballotPaper) + 1);
        }

        String president = "A"; // A 후보를 default 로 설정
        int ballot = 0;

        // 가장 투표 수가 많은 후보 찾기
        for (String key : candidate.keySet()) {
            if (candidate.get(key) > ballot) {
                president = key;
                ballot = candidate.get(key);
            }
        }

        return president;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentNum = input.nextInt(); // 학생 수 -> 사용 X
        String[] ballotPapers = input.next().split(""); // 투표용지들
        System.out.println(solution(ballotPapers));
    }
}
