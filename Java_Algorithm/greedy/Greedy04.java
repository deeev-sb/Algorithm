package greedy;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 최대 수입 스케쥴 (PriorityQueue 응용 문제)
 * N개 기업에서 강연 요청이 왔다.
 * 각 기업은 D일 안에 와서 강연을 해주면 M 만큼의 강연료를 주기로 했다.
 * 하루에 하나의 기업에서만 강연 할 수 있을 때, 최대로 벌 수 있는 수입은?
 * 입력
 * 6
 * 50 2
 * 20 1
 * 40 2
 * 60 3
 * 30 3
 * 30 1
 * 출력
 * 150
 * ===
 * 타임아웃이 발생해서 시작 시간과 종료 시간 체크해가며 코드 리팩토링 함..
 */
public class Greedy04 {
    static class Lecture implements Comparable<Lecture> {
        int money;
        int time;
        int idx;

        Lecture(int money, int time, int idx) {
            this.money = money;
            this.time = time;
            this.idx = idx;
        }

        @Override
        public int compareTo(Lecture lecture) {
            return this.money < lecture.money ? 1 : -1;
        }
    }

    public static int solution(int companies, int[][] lectureInfo) {
        int answer = 0;
        boolean[] isChecked = new boolean[companies]; // 강의 진행 여부 표시
        // 시간역순으로 정렬
        Arrays.sort(lectureInfo, (o1, o2) -> o2[1] - o1[1]);

        // 시간역순으로 강의 선정 (금액 체크)
        int maxTime = lectureInfo[0][1];
        PriorityQueue<Lecture> lectures = new PriorityQueue<>(); // 우선순위 : 강연료 내림차순
        int idx = 0;
        for (int time = maxTime; time > 0; time--) {
            // 강의 시간 체크
            for (; idx < companies; idx++) {
                if (lectureInfo[idx][1] != time) { // 강의 시간이 다른 경우 (현재 타임이 아닌 경우) break
                    break;
                }
                lectures.offer(new Lecture(lectureInfo[idx][0], lectureInfo[idx][1], idx));
            }
            if (!lectures.isEmpty()) {
                Lecture lecture = lectures.poll();
                isChecked[lecture.idx] = true;
                answer += lecture.money;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int companies = input.nextInt();
        int[][] lectureInfo = new int[companies][2];

        for (int idx = 0; idx < companies; idx++) {
            lectureInfo[idx][0] = input.nextInt(); // 강연료
            lectureInfo[idx][1] = input.nextInt(); // 기한
        }

        System.out.println("StartTime = " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        System.out.println(solution(companies, lectureInfo));
        System.out.println("EndTime = " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }
}