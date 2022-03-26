package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 괄호문자제거
 * 입력된 문자열에서 소괄호 () 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)  ->  EFLM
 * ====
 * Stack 이 아닌 Deque 을 사용한 이유는 StackQueue01.java 참고
 */
public class StackQueue02 {
    public static String solution(String[] text) {
        Deque<String> bracketStack = new ArrayDeque<>();
        StringBuilder answer = new StringBuilder();

        for (String word : text) {
            if (word.equals("(")) bracketStack.push(word);
            else if (word.equals(")")) bracketStack.pop();
            else if (bracketStack.isEmpty()) answer.append(word);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.next().split("");
        System.out.println(solution(text));
    }
}