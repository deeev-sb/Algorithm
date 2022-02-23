package String;

import java.util.Scanner;

// 문자 찾기
public class String01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.next().toLowerCase().split("");
        String word = input.next().toLowerCase();

        int answer = 0;

        for (String s : text) {
            if (s.equals(word)) {
                answer++;
            }
        }

        System.out.println(answer);

    }
}
