package greedy;

import java.util.Scanner;

/**
 * 결혼식
 * 결혼식 피로연을 장소를 빌려 3일간 진행하려 한다.
 * N명의 친구들이 참석하는 시간 정보를 친구들에게 미리 요구했다.
 * 각 친구들은 자신들의 도착 시간과 출발 시간을 알려주었다.
 * 이 정보를 바탕으로 피로연 장소에 동시에 존재하는 최대 인원수를 구하여
 * 그 인원이 수용할 수 있는 장소를 빌리려 한다.
 * 피로연장에 동시에 존재하는 최대 인원을 출력하라
 * 시간은 첫날 0시를 0으로 해서 마지막날 밤 12시를 72로 하는 타임라인으로 표현된다.
 * 입력
 * 5
 * 14 18
 * 12 15
 * 15 20
 * 20 30
 * 5 14
 * 출력
 * 2
 */
public class Greedy03 {
    public static int solution(int[][] friends) {
        int answer = 0;
        int[] timeline = new int[72];

        for (int[] friend : friends) {
            int start = friend[0]; // 도착 시간
            int end = friend[1]; // 출발 시간
            for (int idx = start; idx < end; idx++) {
                timeline[idx] += 1;
                answer = Math.max(answer, timeline[idx]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int friendNums = input.nextInt();
        int[][] friends = new int[friendNums][2];

        for (int idx = 0; idx < friendNums; idx++) {
            friends[idx][0] = input.nextInt();
            friends[idx][1] = input.nextInt();
        }

        System.out.println(solution(friends));
    }
}