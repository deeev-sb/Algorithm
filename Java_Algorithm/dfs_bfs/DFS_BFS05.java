package dfs_bfs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 동전 교환
 * 여러 단위의 동전들이 주어져 있을 때 거스름돈을 교환할 수 있는 동전의 최소 개수를 출력하라
 * 입력
 * 3      // 동전 종류 수
 * 1 2 5  // 각 종류의 동전 금액
 * 15     // 거슬러 줄 금액
 * 출력
 * 3
 */
public class DFS_BFS05 {
    static int answer = 500; // 예상 최대 횟수로 초기화

    public static void findMinCoins(int curAmount, int curCount, int typeNum, int[] coins, int amount) {
        if (answer <= curCount || amount < curAmount) { // 현재 최대 횟수보다 더 많은 경우 또는 현재 금액이 거스름돈보다 많은 경우 체크 X
            return;
        }

        if (curAmount == amount) { // 현재 금액과 거스름돈이 일치할 때
            answer = Math.min(answer, curCount);
            return;
        }

        for (int idx = typeNum - 1; idx >= 0; idx--) {
            findMinCoins(curAmount + coins[idx], curCount + 1, typeNum, coins, amount);
        }
    }

    public static int solution(int typeNum, int[] coins, int amount) {
        Arrays.sort(coins);
        findMinCoins(0, 0, typeNum, coins, amount);
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int typeNum = input.nextInt();
        int[] coins = new int[typeNum];
        for (int idx = 0; idx < typeNum; idx++) {
            coins[idx] = input.nextInt();
        }
        int amount = input.nextInt();
        System.out.println(solution(typeNum, coins, amount));
    }
}