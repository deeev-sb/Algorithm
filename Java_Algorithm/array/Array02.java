package array;

import java.util.Scanner;

/* 보이는 학생
n명의 학생을 줄로 세웠을 때 맨 앞에서 보이는 최대 학생 수
아래와 같은 경우에는 1, 2, 3, 6, 8번째 학생 이렇게 5명이 보임
8                                 -> 5
130 135 148 140 145 150 150 153
 */
public class Array02 {
    public static int solution(int[] students) {
        int tallStudentHeight = 0; // 큰 학생의 키
        int visibleStudentCnt = 0; // 보이는 학생 수

        for (int studentHeight : students) {
            if (tallStudentHeight < studentHeight) {
                tallStudentHeight = studentHeight;
                visibleStudentCnt++;
            }
        }

        return visibleStudentCnt;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] students = new int[num];

        for (int idx = 0; idx < num; idx++) {
            students[idx] = input.nextInt();
        }

        System.out.println(solution(students));
    }
}
