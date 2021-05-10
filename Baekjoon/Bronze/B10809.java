package Baekjoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B10809 { // 알파벳 찾기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alpaIdx = new int[26]; // 알파벳 소문자가 처음 등장한 위치 저장
        Arrays.fill(alpaIdx, -1);
        int idx = 0;
        for (char c : str.toCharArray()) {
            int strIdx = c - 'a';
            if (alpaIdx[strIdx] == -1) {
                alpaIdx[strIdx] = idx;
            }
            idx++;
        }

        for (int i : alpaIdx) {
            System.out.printf("%d ", i);
        }
    }

}
