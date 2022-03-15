package String;

import java.util.Scanner;

// 가장 짧은 문자거리
// 문자열 text의 각 문자가 문자 word와 떨어진 최소 거리 출력
// teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
// 처음 나온 word 위치를 A 두 번째로 나온 word 위치를 B라고 할 때
// 현재 위치 인덱스에서 A와 B 중 거리가 더 가까운 것을 기록하는 방식으로 진행
public class String10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String word = input.next();
        int textLen = text.length(); // 문자열 길이
        int[] wordDistance = new int[textLen]; // word 와의 거리 배열

        int wordIndex = text.indexOf(word); // 문자 word 인덱스 값
        int prevWordIndex = -1;

        // 문자열에 존재하는 모든 word 인덱스 값에 대해 거리 비교
        for (int idx = 0; idx < textLen; idx++) {
            if (Character.toString(text.charAt(idx)).equals(word)) {
                wordDistance[idx] = 0;
                prevWordIndex = wordIndex;
                wordIndex = text.indexOf(word, idx + 1);
            } else {
                if (prevWordIndex < 0) {
                    wordDistance[idx] = Math.abs(wordIndex - idx);
                } else {
                    wordDistance[idx] = Math.min(Math.abs(wordIndex - idx), Math.abs(prevWordIndex - idx));
                }
            }
        }

        for (int distance : wordDistance) {
            System.out.print(distance + " ");
        }
    }
}
