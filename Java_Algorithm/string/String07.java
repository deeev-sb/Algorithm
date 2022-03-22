package string;

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

        // 회문 문자열 확인
        for (int i = 0; i < textLen / 2; i++) {
            if (Character.compare(text.charAt(i), text.charAt(textLen - 1 - i)) != 0) {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);
    }
}

/* StringBuilder(text).reverse()한 값과 text가 동일한지 확인하는 방법으로 간단하게 비교하는 방법도 있음.
class Main {
    public static void main(String[] args) {
        String answer = "NO";
        Scanner input = new Scanner(System.in);
        String text = input.next().toLowerCase();
        String reverse = new StringBuilder(text).reverse().toString();

        // 회문 문자열 확인
        if (text.equals(reverse)) answer = "YES";

        System.out.println(answer);
    }
}
*/