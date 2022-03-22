package string;

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
            } else {
                answer.append(Character.toUpperCase(word));
            }
        }

        System.out.println(answer);

    }
}

/* 아래와 같이 아스키 코드를 활용하는 방법도 있음. 대문자 (65-90), 소문자 (97-122)로 32 차이남.
class Main {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) answer += (char) (x - 32);
            else answer += (char) (x + 32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.print(T.solution(str));
    }
}
*/