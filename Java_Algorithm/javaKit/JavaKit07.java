package javaKit;

import java.util.Stack;

/**
 * 올바른 괄호의 갯수
 * 올바른 괄호란 (()) 나 () 와 같이 올바르게 모두 닫힌 괄호를 의미
 * )( 나 ())() 와 같은 괄호는 올바르지 않은 괄호가 됨
 * 괄호 상의 개수 n 이 주어질 때, n 개의 괄호 쌍으로 만들 수 있는 모든 가능한 괄호 문자열 갯수 반환
 * n = 2 이면 (()) ()() 와 같이 2가지를 만들 수 있음
 * n 은 1 이상 14 이하 정수
 * =====
 * n	result
 * 2	2
 * 3	5
 * =====
 * 괄호 보내는 순서에 대한 기록이 들어가면 좋을 것 같음
 * (    -> (     -> )   -> (     -> ) -> ) 이 순서로 간다고 할 때
 * (1 )0   (2 )0   (2 )1   (3 )1 ... 이런 식으로
 * 괄호 열기와 괄호 닫기의 수를 세면서 진행
 * 괄호 열고 닫은 합이 2 * n 이 되면 완성
 * 만약 진행 과정 중에서 괄호 열기 보다 괄호 닫기가 많은 경우 제외
 */
class Bracket {
    int open;
    int close;

    Bracket(int open, int close) {
        this.open = open;
        this.close = close;
    }
}

public class JavaKit07 {
    public static int solution(int n) {
        int answer = 0;

        Bracket bracket = new Bracket(0, 0);
        Stack<Bracket> stack = new Stack<>();
        stack.push(bracket);

        while (!stack.isEmpty()) {
            Bracket curBracket = stack.pop();
            int open = curBracket.open;
            int close = curBracket.close;

            if (open > n || open < close) {
                continue;
            }

            if (open + close == 2 * n) {
                answer++;
                continue;
            }

            stack.push(new Bracket(open + 1, close));
            stack.push(new Bracket(open, close + 1));
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] n = {2, 3};

        for (int idx = 0; idx < 2; idx++) {
            System.out.println(solution(n[idx]));
        }
    }
}
