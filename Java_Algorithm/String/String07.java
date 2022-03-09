package String;

import java.util.Scanner;

// 회문 문자열
// 대소문자 구분 없이 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열인 경우 회문 문자열이므로 "YES" 출력.
// 회문 문자열이 아니면 "NO" 출력
// gooG -> YES
// god -> NO
public class String07 {
    public static void main(String[] args) {
        String answer = "YES";
        Scanner input = new Scanner(System.in);
        String text = input.next().toLowerCase();
        int textLen = text.length();

        for (int i = 0; i < textLen / 2; i++) {
            if (Character.compare(text.charAt(i), text.charAt(textLen - 1 - i)) != 0) {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }
}
