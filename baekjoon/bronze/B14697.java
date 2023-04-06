package baekjoon.bronze;

import java.util.Scanner;

/**
 * 방 배정하기
 * 학생들이 묵을 숙소에는 방의 정원을 기준으로 세 종류의 방이 있으며,
 * 같은 종류의 방들이 여러 개 있다.
 * 학생들에게 이 방들을 배정하되, 배정된 모든 방에 빈 침대가 없도록 하자.
 * 방 정원을 나타내는 서로 다른 세 자연수와 전체 학생 수를 나타내는 자연수가 주어진다.
 * 빈 침대 없이 배정이 가능할 경우 1, 불가능할 경우 0을 출력한다.
 * 1 <= A < B < C <= 50
 * 단순히 큰 방에 먼저 넣으면 3, 8, 10, 11은 방배정이 불가능하다고 함.
 * 최대 50개이므로
 */
public class B14697 {

    public static int solution(int roomA, int roomB, int roomC, int students) {
        int answer = 0;
        boolean check = false;

        for (int i = 0; i <= students/roomA; i++) {
            if (check) break;
            for (int j = 0; j <= students/roomB; j++) {
                if (check) break;
                for (int k = 0; k <= students/roomC; k++) {
                    if (roomA * i + roomB * j + roomC * k == students) {
                        check = true;
                        answer = 1;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roomA = input.nextInt();
        int roomB = input.nextInt();
        int roomC = input.nextInt();
        int students = input.nextInt();

        System.out.println(solution(roomA, roomB, roomC, students));
    }
}
