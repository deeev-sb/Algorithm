package Baekjoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B4153 { // 직각삼각형
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] nums = new int[3];

            for (int i = 0; i < 3; i++) {
                nums[i] = sc.nextInt();
                nums[i] *= nums[i];
            }

            if (nums[0] == 0) {
                break;
            }

            Arrays.sort(nums);

            if (nums[0] + nums[1] == nums[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
