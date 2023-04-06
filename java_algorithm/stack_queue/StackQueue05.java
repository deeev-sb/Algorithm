package stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 쇠막대기
 * 여러 개의 쇠막대기를 레이저로 절단하려고 할 대,
 * 효율적인 작업을 위해 쇠막대기를 아래에서 위로 겹쳐 놓고
 * 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다
 * 조건
 * 1. 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다.
 * 2. 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치치 않도록 놓는다.
 * 3. 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
 * 4. 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
 * 레이저와 쇠막대기의 배치는 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있다.
 * 1. 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍으로 표현된다. 모든 '()'는 반드시 레이저를 표현한다.
 * 2. 쇠막대기의 왼쪽 끝은 여는 괄호, 오른쪽 끝는 닫는 괄호로 표현된다.
 * 잘려진 쇠막대기의 총 개수는?
 */
public class StackQueue05 {
    public static int solution(String ironRod) {
        int answer = 0;
        Stack<Character> brackets = new Stack<>();

        char prevBracket = ' ';
        for (int idx = 0; idx < ironRod.length(); idx++) {
            char bracket = ironRod.charAt(idx);

            if (bracket == '(') { // 괄호 열기
                brackets.push('(');
            } else { // 괄호 닫기
                brackets.pop();
                if (prevBracket == bracket) { // 쇠막대기 끝
                    answer++;
                } else { // 레이저
                    answer += brackets.size();
                }
            }

            prevBracket = bracket;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ironRod = input.next(); // 쇠막대들 정보

        System.out.println(solution(ironRod));
    }
}