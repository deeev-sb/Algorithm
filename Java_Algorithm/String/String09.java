package String;

import java.util.Scanner;

// 숫자만 추출
// 문자와 숫자가 섞여잇는 문자열이 주어지면 그 중 숫자만 추출하고 그 순서대로 자연수 생성
// g0en2T0s8eSoft -> 208
// tge0a1h205we -> 1205
public class String09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 입력 받은 문자열에서 숫자가 아닌 문자는 제거 후 문자를 int 타입으로 변경
        int num = Integer.parseInt((input.nextLine().replaceAll("[^0-9]", "")));

        System.out.println(num);
    }
}
