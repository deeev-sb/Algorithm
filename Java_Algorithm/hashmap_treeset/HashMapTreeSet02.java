package hashmap_treeset;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 * 아나그램 (해쉬)
 * 두 문자열이 알파벳의 나열 순서는 다르지만 구성이 일치하면 두 단어는 아나그램
 * AbaAeCe와 baeeACA는 알파벳 순서가 다르지만 구성을 살펴보면
 * A(2), a(1), b(1), C(1), e(2)로 알파벳 개수가 모두 일치함
 * 두 단어가 아나그램이면 "YES", 아니면 "NO" 출력
 * 입력 1
 * AbaAeCe
 * baeeACA
 * 출력 1
 * YES
 * 입력 2
 * abaCC
 * Caaab
 * 출력 2
 * NO
 */
public class HashMapTreeSet02 {
    public static String solution(String word1, String word2) {
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        if (word1.length() != word2.length()) {
            return "NO";
        }

        for (int idx = 0; idx < word1.length(); idx++) {
            Character key = word1.charAt(idx);
            hashMap1.put(key, hashMap1.getOrDefault(key, 1) + 1);
            key = word2.charAt(idx);
            hashMap2.put(key, hashMap2.getOrDefault(key, 1) + 1);
        }

        Set<Character> keySet1 = hashMap1.keySet();
        Set<Character> keySet2 = hashMap2.keySet();

        if (keySet1.size() != keySet2.size()) {
            return "NO";
        }

        for (Character key : keySet1) {
            if (!Objects.equals(hashMap1.get(key), hashMap2.get(key))) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1 = input.next();
        String word2 = input.next();
        System.out.println(solution(word1, word2));
    }
}
