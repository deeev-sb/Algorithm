package string;

import java.util.Scanner;

// 특정 문자 뒤집기
// 알파벳만 뒤집힌 문자열 출력
// a#b!GE*T@S -> S#T!EG*b@a
public class String05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        StringBuilder alpha = new StringBuilder(text.replaceAll("[^a-zA-z]", "")).reverse();
        StringBuilder answer = new StringBuilder(text.replaceAll("[a-zA-z]", "0"));


        int idx = 0;
        char str;
        for (int i = 0; i < answer.length(); i++) {
            str = answer.charAt(i);
            if (Character.compare(str, '0') == 0) {
                answer.replace(i, i+1, String.valueOf(alpha.charAt(idx++)));
            }
        }

        System.out.println(answer);
    }
}

