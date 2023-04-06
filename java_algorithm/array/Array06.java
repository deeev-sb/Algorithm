package array;

import java.util.Scanner;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후
 * 그 수가 소수이면 그 소수를 출력하는 프로그램
 * 32 를 뒤집으면 23이고, 23은 소수
 * 단, 910을 뒤집으면 19로 숫자화 해야 함
 * 3 <= N <= 100
 * N개의 자연수가 주어짐
 * 각 자연수의 크기는 100,000를 넘지 않음
 * 입력
 * 9
 * 32 55 62 20 250 370 200 30 100
 * 출력
 * 23 2 73 2 3
 */
public class Array06 {
    public static String solution(String[] nums) {
        StringBuilder answer = new StringBuilder();

        // 100000 에 대한 소수 모두 찾기
        int maxNum = 100000;
        boolean[] isNotPrimeNums = new boolean[maxNum + 1];
        isNotPrimeNums[0] = isNotPrimeNums[1] = true;
        for (int i = 2; i <= maxNum; i++) {
            if (isNotPrimeNums[i]) continue;

            for (int j = i + i; j <= maxNum; j+= i ) {
                isNotPrimeNums[j] = true;
            }
        }

        // 숫자 뒤집어서 소수인지 판별
        for (String num : nums) {
            StringBuilder numStr = new StringBuilder(num);
            int n = Integer.parseInt(numStr.reverse().toString());

            if (!isNotPrimeNums[n]) answer.append(n).append(" ");
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String[] nums = new String[num];

        for (int idx = 0; idx < num; idx++) {
            nums[idx] = input.next();
        }

        System.out.println(solution(nums));
    }
}
