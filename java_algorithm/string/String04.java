package string;

import java.util.Scanner;

// 단어 뒤집기
// N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력
// good -> doog
// Time -> emiT
public class String04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder;

        int testcase = input.nextInt();

        for (int i = 0; i < testcase; i++) {
            stringBuilder = new StringBuilder(input.next());
            stringBuilder.reverse();
            System.out.println(stringBuilder);
        }
    }
}
