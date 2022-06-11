package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Least Recently Used
 * LRU 알고리즘은 가장 최근에 사용하지 않은 것을 제거하는 알고리즘이다.
 * 해당 알고리즘을 통해 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면
 * N개의 작업을 처리한 후 캐시 메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하라
 * 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력하라
 * 입력
 * 5 9
 * 1 4 5 2 4 6 3 4 7
 * 출력
 * 7 4 3 6 2
 */
public class SortingSearching04 {
    public static String solution(int cacheSize, int workNums, int[] works) {
        int[] answer = new int[cacheSize];
        boolean[] job = new boolean[101]; // 작업 번호는 1부터 100까지

        int idx = 0;
        while (idx < cacheSize) {
            int temp = works[--workNums]; // 작업의 역순으로 탐색

            if (job[temp]) continue; // 최근에 사용된 적이 있으면 넘어감

            answer[idx++] = temp;
            job[temp] = true; // 최근에 사용함 표시
        }

        return Arrays.toString(answer).replaceAll("[\\[\\],]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cacheSize = input.nextInt();
        int workNums = input.nextInt();
        int[] works = new int[workNums];

        for (int idx = 0; idx < workNums; idx++) {
            works[idx] = input.nextInt();
        }

        System.out.println(solution(cacheSize, workNums, works));
    }
}
