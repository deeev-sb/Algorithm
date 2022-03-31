package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 선택 정렬
 * N개 숫가가 입력되면 오름차순으로 정렬하여 출력하는 프로그램 작성하기
 * 정렬 방법은 선택 정렬
 * 6                 ->  5 7 11 13 15 23
 * 13 5 11 7 23 15
 * ====
 * 선택 정렬이란 ?
 * 첫 번째 자료를 두 번째 자료부터 마지막 자료까지 차례대로 비교하며 가장 작은 값을 찾아서 첫 번재 위치에 두고,
 * 두 번째 자료를 세 번째 자료부터 마지막 자료까지 차례대로 비교하여 가장 작은 값을 찾아서 두 번째 위치에 두는 것을
 * 모든 자료의 순서에 맞춰 반복하여 정렬하는 것이다.
 * 선택 정렬 알고리즘 시간 복잡도는 O(n^2)이다.
 */
public class SortingSearching01 {
    public static String solution(int num, int[] nums) {
        int originNum;
        int minNum;
        int minIdx;
        for (int i = 0; i < num - 1; i++) {
            originNum = nums[i];
            minNum = nums[i];
            minIdx = i;
            for (int j = i; j < num; j++) {
                if (minNum > nums[j]) {
                    minNum = nums[j];
                    minIdx = j;
                }
            }
            nums[i] = minNum;
            nums[minIdx] = originNum;
        }
        return Arrays.toString(nums).replaceAll("[\\[\\],]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(solution(num, nums));
    }
}
