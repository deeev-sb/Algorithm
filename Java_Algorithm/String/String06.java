package String;

import java.util.Scanner;

// 중복문자제거
// 중복된 문자가 제거된 문자열 출력
// ksekkset -> kset
// indexOf는 지정한 문자가 처음 발견된 위치 반환환
public class String06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        String text = input.next();

        for (int i = 0; i < text.length(); i++) {
            if (text.indexOf(text.charAt(i)) == i) {
                answer += text.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
