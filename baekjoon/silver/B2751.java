package baekjoon.silver;

import java.util.*;

public class B2751 { // 수 정렬하기 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            nums.add(sc.nextInt());
        }

        Collections.sort(nums);

        for (int n : nums) {
            sb.append(n).append('\n');
        }

        System.out.println(sb);
    }
}
