package String;

import java.util.Scanner;

// 대소문자 변환
// text에 포함된 대문자는 소문자로, 소문자는 대문자로 변환해 출력
public class String02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();

        char[] text = input.next().toCharArray();

        for (char word : text) {
            if (Character.isUpperCase(word)) {
                answer.append(Character.toLowerCase(word));
            }
            else {
                answer.append(Character.toUpperCase(word));
            }
        }

        System.out.println(answer);
        
    }
}
