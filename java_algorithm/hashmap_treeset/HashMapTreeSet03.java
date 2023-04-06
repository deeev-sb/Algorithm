package hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 매출액의 종류
 * N일 동안 매출 기록을 주고 연속된 K일 동안 매출액의 종류를
 * 각 구간별로 구할 때, 구간별 매출액의 종류 출력
 * N = 7이고 K = 4일 때, 매출 기록이 아래와 같다면
 * 20 12 20 10 23 17 10
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 */
public class HashMapTreeSet03 {
    public static String solution(int len, int consecutiveDays, int[] sales) {
        StringBuilder answer = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int point = 0;
        int key = sales[0];
        hashMap.put(key, 1);
        key = sales[1];
        hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);

        for (int idx = 2; idx < len; idx++) {
            if (idx - point == consecutiveDays) {
                answer.append(hashMap.size()).append(" ");
                key = sales[point++];
                hashMap.put(key, hashMap.get(key) - 1);
                if (hashMap.get(key) == 0) {
                    hashMap.remove(key);
                }
            }
            key = sales[idx];
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
        }

        answer.append(hashMap.size());

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int consecutiveDays = input.nextInt();
        int[] sales = new int[len];
        for (int idx = 0; idx < len; idx++) {
            sales[idx] = input.nextInt();
        }
        System.out.println(solution(len, consecutiveDays, sales));
    }
}
