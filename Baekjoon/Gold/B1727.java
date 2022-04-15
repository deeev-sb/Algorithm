package Baekjoon.Gold;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 커플 만들기
 * 여자친구 없는 남자 n명과 남자친구가 없는 여자 m명을 불러 모아서 이성 친구를 만들어줌.
 * 최대한 비슷한 성격의 사람들을 짝 지어줘야 함.
 * 성격의 수치가 주어질 때, 최대한 많은 커플을 만들고,
 * 각 커플을 이루는 두 사람의 성격 차이의 합이 최소가 되도록 하려 할 때
 * 성격 차이의 합의 최솟값 출력
 * 남자 수 n, 여자수 m명이 먼저 주어지고
 * 남자들의 성격, 여자들의 성격이 주어진다
 * 2  1          -> 5
 * 10 20
 * 15
 */
public class B1727 {
    public static int solution(int man, int woman, int[] mansPersonalities, int[] womanPersonalities) {
        int[][] sumPersonalityDifferences = new int[man + 1][woman + 1];

        Arrays.sort(mansPersonalities);
        Arrays.sort(womanPersonalities);

        for (int i = 1; i < man + 1; i++) {
            for (int j = 1; j < woman + 1; j++) {
                sumPersonalityDifferences[i][j] = sumPersonalityDifferences[i - 1][j - 1] + Math.abs(mansPersonalities[i - 1] - Math.abs(womanPersonalities[j - 1]));
                if (i > j) { // 바로 앞 사람이 j를 고른 경우와 내가 j를 고른 경우 비교
                    sumPersonalityDifferences[i][j] = Math.min(sumPersonalityDifferences[i][j], sumPersonalityDifferences[i - 1][j]);
                } else if (i < j) { // 내가 i 앞 사람을 골랐을 때와 i를 골랐을 때를 비교
                    sumPersonalityDifferences[i][j] = Math.min(sumPersonalityDifferences[i][j], sumPersonalityDifferences[i][j - 1]);
                } // i == j인 경우가 없는 이유는 이미 정렬된 상태에서 최선의 사람을 골랐기 때문!
            }
        }

        return sumPersonalityDifferences[man][woman];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int man = input.nextInt();
        int woman = input.nextInt();

        int[] mansPersonalities = new int[man];
        for (int i = 0; i < man; i++) {
            mansPersonalities[i] = input.nextInt();
        }

        int[] womanPersonalities = new int[woman];
        for (int i = 0; i < woman; i++) {
            womanPersonalities[i] = input.nextInt();
        }

        System.out.println(solution(man, woman, mansPersonalities, womanPersonalities));
    }
}
