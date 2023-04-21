package doit;

import java.util.Arrays;
import java.util.Scanner;

/*
BOJ 1940. 주몽
두 재료의 고유한 번호를 합쳐서 M이 되면 갑옷이 만들어지게 된다.
N개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지 구하라.
 */
public class Ch03P07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int material = sc.nextInt();
        ;
        int armor = sc.nextInt();
        int[] materials = new int[material];

        for (int i = 0; i < material; i++) {
            materials[i] = sc.nextInt();
        }

        System.out.println(solution(material, armor, materials));
    }

    private static int solution(int material, int armor, int[] materials) {
        int answer = 0;
        int left = 0;
        int right = material - 1;

        Arrays.sort(materials);

        while (left < right) {
            int sum = materials[left] + materials[right];
            if (sum < armor) {
                left++;
            } else {
                if (sum == armor) answer++;
                right--;
            }
        }


        return answer;
    }
}
