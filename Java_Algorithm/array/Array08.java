package array;

import java.util.*;

/**
 * 등수 구하기
 * N명의 학생의 국어 점수가 입력되면
 * 각 학생의 등수를 입력된 순서대로 출력하는 프로그램
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리
 * 가장 높은 점수가 92점인데, 92점이 3명 존재하면 1등이 3명,
 * 그 다음 학생은 4등이 된다.
 * 3 <= N <= 100
 * 입력
 * 5
 * 87 89 92 100 76
 * 출력
 * 4 3 2 1 5
 */
public class Array08 {
    public static void solution(int num, int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int idx = 0; idx < num; idx++) {
            numMap.put(idx, nums[idx]);
        }

        List<Map.Entry<Integer, Integer>> listNums = new LinkedList<>(numMap.entrySet());
        listNums.sort(((o1, o2) -> numMap.get(o2.getKey()) - numMap.get(o1.getKey())));

        int rank = 1;
        int preRank = 1;
        int preValue = -1;
        for (int idx = 0; idx < num; idx++) {
            int key = listNums.get(idx).getKey();
            int value = listNums.get(idx).getValue();
            if (preValue != value) {
                nums[key] = rank;
                preRank = rank;
            } else {
                nums[key] = preRank;
            }
            rank++;
            preValue = value;
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] nums = new int[num];

        for (int idx = 0; idx < num; idx++) {
            nums[idx] = input.nextInt();
        }

        solution(num, nums);
    }
}
