package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 회의실 배정
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만드려한다.
 * 각 회의에 대해 시작 시간과 끝나는 시간이 주어질 때, 겹치지 않게 사용할 수 있는 최대 회의 수는?
 * 입력
 * 5
 * 1 4
 * 2 3
 * 3 5
 * 4 6
 * 5 7
 * 출력
 * 3
 */
public class Greedy02 {
    public static int solution(int meetingNums, int[][] meetings) {
        int answer = 1;

        // 끝나는 시간 기준 정렬. 끝나는 시간이 같으면 시작하는 시간 기준으로 정렬
        Arrays.sort(meetings, (o1, o2) -> o1[1] != o2[1] ? o1[1] - o2[1] : o1[0] - o2[0]);

        int prevEndTime = meetings[0][1]; // 첫 회의 끝나는 시간
        for (int idx = 1; idx < meetingNums; idx++) {
            // 현재 시작하려는 회의의 시간이 앞에 진행한 회의 끝나는 시간보다 크거나 같을 때
            if (prevEndTime <= meetings[idx][0]) {
                answer++;
                prevEndTime = meetings[idx][1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int meetingNums = input.nextInt(); // 회의 수
        int[][] meetings = new int[meetingNums][2];

        for (int idx = 0; idx < meetingNums; idx++) {
            meetings[idx][0] = input.nextInt();
            meetings[idx][1] = input.nextInt();
        }

        System.out.println(solution(meetingNums, meetings));
    }
}