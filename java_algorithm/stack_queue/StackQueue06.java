package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 공주 구하기
 * 왕자 N명 중 공주를 구하러 갈 왕자를 정하는 방법은 아래와 같다
 * 1. 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
 * 2. 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
 * 3. 특정 숫자 K를 외지면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
 * 4. 다음 왕자를 시작으로 1 ~ 3 반복하여 남은 왕자가 공주를 구하러 갈 수 있다.
 */
public class StackQueue06 {
    public static int solution(int princes, int key) {
        Queue<Integer> sequence = new LinkedList<>(); // 왕자들이 숫자를 외치는 순서

        // 왕자들 번호 매기기
        for (int idx = 0; idx < princes; idx++) {
            sequence.add(idx + 1);
        }

        int num = 1; // 왕자들이 외치는 숫자
        while (sequence.size() > 1) {
            int prince = sequence.poll();

            if (num == key) {
                num = 1;
            } else {
                sequence.add(prince);
                num++;
            }
        }

        return sequence.poll();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int princes = input.nextInt();
        int key = input.nextInt();

        System.out.println(solution(princes, key));
    }
}