package stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산 (postfix)
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요
 * 만약 3 * (5 + 2) - 9 를 후위연산식으로 표현하면 352+*9-로 표현되며 그 결과는 12입니다.
 */
public class StackQueue04 {
    public static String solution(String calculation) {
        Stack<String> numbers = new Stack<>(); // 숫자만 담는 Stack

        for (int idx = 0; idx < calculation.length(); idx++) {
            char operator = calculation.charAt(idx);
            if (Character.isDigit(operator)) {
                numbers.add(String.valueOf(operator));
            } else {
                // 들어가는 순서가 반대
                int num2 = Integer.parseInt(numbers.pop());
                int num1 = Integer.parseInt(numbers.pop());

                switch (operator) {
                    case '+':
                        numbers.add(String.valueOf(num1 + num2));
                        break;
                    case '-':
                        numbers.add(String.valueOf(num1 - num2));
                        break;
                    case '*':
                        numbers.add(String.valueOf(num1 * num2));
                        break;
                    case '/':
                        numbers.add(String.valueOf(num1 / num2));
                        break;
                    default:
                        break;
                }
            }
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String calculation = input.next();

        System.out.println(solution(calculation));
    }
}