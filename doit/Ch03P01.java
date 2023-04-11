package doit;

import java.util.Scanner;

/*
BOJ 11720. 숫자의 합
N개의 숫자가 공백 없이 쓰여 있을 때, 이 숫자를 모두 합한 값 구하기.
참고로, 숫자는 모두 한 자리이다.
 */
public class Ch03P01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String allNumber = sc.next();

        System.out.println(solution(size, allNumber));
//        System.out.println(myOldSolution(size, allNumber));
//        System.out.println(doItSolution(size, allNumber));
    }

    private static int doItSolution(int size, String allNumber) {
        char[] numbers = allNumber.toCharArray();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer += numbers[i] - '0';
        }
        return answer;
    }

    private static int myOldSolution(int size, String allNumber) {
        int answer = 0;

        for (int i = 0; i < size; i++) {
            answer += allNumber.charAt(i) - '0';
        }

        return answer;
    }

    private static int solution(int size, String allNumber) {
        String[] numbers = allNumber.split("");
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}
