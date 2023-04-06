package dp;

import java.util.Scanner;

/**
 * 돌다리 건너기
 * N개의 돌다리를 건널 때 한 칸 또는 두 칸씩만 건널 수 있다.
 * 개울을 건너는 방법은 몇 가지 일까
 * 입력
 * 7
 * 출력
 * 34
 */
public class DP02 {
    public static int solution(int numberOfStone) {
        int[] wayToCrossStone = new int[numberOfStone + 1]; // 도착 지점도 고려해야 함

        wayToCrossStone[0] = 1;
        wayToCrossStone[1] = 2;

        for (int idx = 2; idx <= numberOfStone; idx++) {
            wayToCrossStone[idx] = wayToCrossStone[idx - 1] + wayToCrossStone[idx - 2];
        }


        return wayToCrossStone[numberOfStone];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStone = input.nextInt();
        System.out.println(solution(numberOfStone));
    }
}