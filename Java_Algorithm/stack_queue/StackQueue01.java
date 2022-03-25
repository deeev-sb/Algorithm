package stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 올바른 괄호
 * 괄호의 쌍이 올바르게 위치하면 "YES", 아니면 "NO"
 * (())()       -> YES
 * (()(()))(()  -> NO
 * ====
 * Stack 이 아닌 Deque 를 사용한 이유?
 * Stack 의 내부를 보면 모든 메소드에 synchronized 가 있기 때문에 단일 스레드 환경에서는 성능이 떨어진다.
 * 또한, 초기 용량을 설정할 수 없으며 Vector 클래스를 상속받기 때문에 LIFO 구조를 유지하는 것이 아닌 중간에 데이터 삽입/삭제가 가능하다.
 * ArrayDeque 은 초기 용량이 16으로 되어 있으며 64 미만일 때 2배씩, 이상일 때 1.5배씩 용량을 늘려준다.
 * 단일 스레드 환경에서는 스택으로 사용할 때 Stack 보다 빠르며, 대기열로 사용할 때는 LinkedList 보다 빠르다.
 * 다만, 멀티 스레드 환경은 지원하지 않는다.
 * => 자세한 내용은 블로그 참고 (https://subin-0320.tistory.com/139)
 */
public class StackQueue01 {
    public static String solution(String[] brackets) {
        Deque<String> bracketStack = new ArrayDeque<>();

        for (String bracket : brackets) {
            if (bracket.equals(")")) {
                if (bracketStack.isEmpty()) { // 비어있는 경우 괄호에 대한 "("가 존재하지 않음
                    return "NO";
                }
                bracketStack.pop();
            } else { // 추가
                bracketStack.push(bracket);
            }
        }

        // 스택이 비어있으면 모드 괄호쌍이 올바르게 위치했다는 의미
        if (bracketStack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] brackets = input.next().split("");
        System.out.println(solution(brackets));
    }
}
