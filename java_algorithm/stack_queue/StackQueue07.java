package stack_queue;

import java.util.Scanner;

/**
 * 교육과정 설계
 * 필수 과목의 순서가 주어지면, 해당 순서대로 과목을 수가애야 한다.
 * N개의 수업 설꼐가 필수 과목 순서대로 짜여지면 YES 아니면 NO를 출력하라.
 */
public class StackQueue07 {
    public static String solution(String requiredSubject, String subjectPlan) {
        int idx = 0; // 필수 과목 idx
        while (idx < requiredSubject.length() && subjectPlan.length() > 0) {
            if (requiredSubject.charAt(idx) == subjectPlan.charAt(0)) {
                idx++;
            }

            subjectPlan = subjectPlan.substring(1);
        }

        return idx == requiredSubject.length() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String requiredSubject = input.next(); // 필수 과목
        String subjectPlan = input.next(); // 과목 수강 계획

        System.out.println(solution(requiredSubject, subjectPlan));
    }
}