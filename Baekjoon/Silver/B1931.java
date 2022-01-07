package Baekjoon.Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 { // 회의실 배정 ( 인덱스 1번, 인덱스 0번 순으로 정렬 후 찾으면 됨)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 1;

        int meetNum = sc.nextInt();
        int[][] meetTime = new int[meetNum][2];

        for (int i = 0; i < meetNum; i++) {
            meetTime[i][0] = sc.nextInt();
            meetTime[i][1] = sc.nextInt();
        }

        Arrays.sort(meetTime, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int lastMeetIndex = 0;
        for (int i = 1; i < meetNum; i++) {
            if (meetTime[lastMeetIndex][1] <= meetTime[i][0]) {
                answer++;
                lastMeetIndex = i;
            }
        }

        System.out.println(answer);
    }
}
