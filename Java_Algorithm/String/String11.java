package String;

import java.util.Scanner;

// 문자열 압축
// 알파벳 대문자로 이루어진 문자열을 받아 같은 문자가 반복되는 경우 오른쪽에 반복 횟수 표기
// 반복횟수가 1인 경우 생략
// KKHSSSSSSSE -> K2HS7E
// KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2
public class String11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.next().split("");
        StringBuilder answer;

        String prevWord = text[0];
        int count = 1;

        answer = new StringBuilder();
        // 반복 횟수 찾기
        for (int idx = 1; idx < text.length; idx++) {
            if (prevWord.equals(text[idx])) {
                count++;
            } else {
                if (count > 1) {
                    answer.append(prevWord).append(count);
                    count = 1;
                } else {
                    answer.append(prevWord);
                }
            }

            prevWord = text[idx];
        }

        // 마지막 문자에 대한 처리
        if (count > 1) {
            answer.append(prevWord).append(count);
        } else {
            answer.append(prevWord);
        }

        System.out.println(answer);
    }
}
