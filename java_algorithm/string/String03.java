package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문장 속 단어
// 문장 속에서 가장 긴 단어 출력. 가장 긴 단어가 여러 개일 경우 문장 가장 앞에 위치한 단어 출력
public class String03 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] words = input.readLine().split(" ");

        String answer = "";
        int answerLen = 0;

        for (String word : words) {
            if (answerLen < word.length()) {
                answer = word;
                answerLen = word.length();
            }
        }

        System.out.println(answer);
    }
}
