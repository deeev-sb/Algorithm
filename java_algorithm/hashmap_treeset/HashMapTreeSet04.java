package hashmap_treeset;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * 모든 아나그램 찾기
 * S 문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램
 * 아나그램 판별 시 대소문자가 구분되며, 부분문자열은 연속된 문자열이어야 함
 * 입력
 * bacaAacba
 * abc
 * 출력
 * 3
 */
public class HashMapTreeSet04 {
    public static int solution(String str1, String str2) {
        int answer = 0;
        int point = 0;
        HashMap<Character, Integer> str2Map = new HashMap<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Character key;

        for (int idx = 0; idx < str2.length(); idx++) {
            key = str2.charAt(idx);
            str2Map.put(key, str2Map.getOrDefault(key, 0) + 1);
        }

        Set<Character> str2KeySet = str2Map.keySet();

        // 비교
        for (int idx = 0; idx < str1.length(); idx++) {
            key = str1.charAt(idx);
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);

            if (idx - point + 1 == str2.length()) {
                boolean check = true;

                for (Character str2Key : str2KeySet) {
                    if (!Objects.equals(str2Map.get(str2Key), hashMap.get(str2Key))) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    answer++;
                }

                key = str1.charAt(point++);
                hashMap.put(key, hashMap.getOrDefault(key, 0) - 1);
                if (hashMap.get(key) == 0) {
                    hashMap.remove(key);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        System.out.println(solution(str1, str2));
    }
}
