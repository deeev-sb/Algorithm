package String;

import java.io.*;

// 유효한 팰린드롬
// 입력된 문자열이 팰린드롬 (앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열) 이면 "YES", 아니면 "NO" 출력
// 문자열은 공백이 존재하지 않음
// 대소문자는 구분하지 않으며, 알파벳 이외의 문자들은 무시
// found7, time: study; Yduts; emit, 7Dnuof -> "YES"
public class String08 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String answer = "NO";

        // 입력 받을 때 대문자를 소문자로 변경 후 소문자가 아닌 모든 문자 제거
        String text = input.readLine().toLowerCase().replaceAll("[^a-z]", "");

        // 순서가 뒤집어진 문자열 생성
        StringBuilder stringBuilder = new StringBuilder(text);
        String reverse = stringBuilder.reverse().toString();

        // 팰린드롬 검사
        if (text.equals(reverse)) {
            answer = "YES";
        }

        System.out.println(answer);
    }
}

// 아래 풀이법은 문자열에 공백을 통해 문자 단위로 끊는다는 가정하에 풀었음.
// 공백이 존재하지 않기 때문에 위의 코드로 변경.
//public class String08 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        String reverse;
//        String answer = "YES";
//
//        // 입력 받을 때 대문자를 소문자로 변경
//        String[] words = input.readLine().toLowerCase().split(" ");
//        int wordsLen = words.length;
//
//        // 소문자를 제외한 모든 문자 제거
//        for (int idx = 0; idx < wordsLen; idx++) {
//            words[idx] = words[idx].replaceAll("[^a-z]", "");
//        }
//
//        // 팰린드롬인지 검사
//        for (int idx = 0; idx < wordsLen/2 ; idx++) {
//            StringBuilder stringBuffer = new StringBuilder(words[wordsLen - 1 - idx]);
//            reverse = stringBuffer.reverse().toString();
//            System.out.println(reverse);
//            if (!words[idx].equals(reverse)) {
//                answer = "NO";
//                break;
//            }
//        }
//
//        System.out.println(answer);
//    }
//}
