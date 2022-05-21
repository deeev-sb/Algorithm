package hashmap_treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * K번째 큰 수
 * 1부터 100 사이의 자연수가 적힌 N장의 카드를 가지고 있으며,
 * 같은 숫자의 카드가 여러 장 있다.
 * 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 한다.
 * 3장을 뽑을 수 있는 모든 경우에 대해 기록했을 때, K 번째로 큰 수를 출력한다.
 * 큰 수부터 25 25 23 23 22 20 ... 이고 K값이 3이면 K번째 큰 값은 22이다.
 * K번재 수가 존재하지 않으면 -1을 출력한다.
 * 입력
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 * 출력
 * 143
 * ===
 * for 문 3개 쓰는게 최선인 것 같음..
 */
public class HashMapTreeSet05 {
    public static int solution(int key, int[] nums) {
        List<Integer> sumList = new ArrayList<>();

        int numsLen = nums.length;
        for (int i = 0; i < numsLen - 2; i++) {
            for (int j = i + 1; j < numsLen - 1; j++) {
                for (int k = j + 1; k < numsLen; k++) {
                    sumList.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        sumList = sumList.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        return sumList.size() > key ? sumList.get(key - 1) : -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numsLen = input.nextInt();
        int k = input.nextInt();
        int[] nums = new int[numsLen];

        for (int idx = 0; idx < numsLen; idx++) {
            nums[idx] = input.nextInt();
        }

        System.out.println(solution(k, nums));
    }
}
