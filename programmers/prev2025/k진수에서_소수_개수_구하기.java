package prev2025;

import java.util.Stack;

// 2022 KAKAO BLIND RECRUITMENT > k진수에서 소수 개수 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/92335
public class k진수에서_소수_개수_구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while(n > k) {
            stack.push(n % k);
            n /= k;
        }

        if (n != 0) stack.push(n);

        long number = 0;
        while (!stack.isEmpty()) {
            Integer popNumber = stack.pop();

            if (popNumber == 0 && number != 0) {
                if (isPrime(number)) {
                    answer++;
                }
                number = 0;
            } else {
                number = number * 10 + popNumber;
            }
        }
        return answer;
    }

    private boolean isPrime(long number) {
        if (number == 1) return false;
        if (number == 2) return true;

        int size = (int)Math.sqrt(number) + 1; // 제곱근 + 1

        // 소인수분해 방식 활용
        for (int i = 3; i < size; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
