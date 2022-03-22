package string;

import java.util.Scanner;

// 암호
// 알파벳 한 문자마다 # 또는 *이 7개로 구성되며, #은 이진수의 1, *은 이진수의 0으로 변환
// #*****# 이면 이진수로 1000001이고 10진수로하면 65이므로 대문자 A
// n개의 문자를 보냈을 때 해석된 문자열을 출력 (항상 대문자로 해석됨)
// 4                             -> COOL
// #****###**#####**#####**##**
public class String12 {
    public static String solution(int num, String secretCode) {
        StringBuilder answer = new StringBuilder();
        String[] codes;
        int code;
        for (int i = 0; i < num; i++) {
            // 7개씩 받아와 코드 구성
            codes = secretCode.substring(7 * i, 7 * (i + 1)).split("");
            code = 0;
            for (int idx = 0; idx < 7; idx++) {
                // 각 코드 확인 -> #이면 1이므로 2진수 계산
                if (codes[idx].equals("#")) {
                    code += Math.pow(2, (6 - idx));
                }
            }
            answer.append((char) code);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String secretCode = input.next();
        System.out.println(solution(num, secretCode));
    }
}
