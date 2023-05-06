package doit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
BOJ 12891. DNA 비밀번호
모든 문자열에 등장하는 문자가 [A, C, G, T]인 문자열을 DNA 문자열이라고 한다.
임의의 DNA 문자열을 만들고, 해당 문자열의 부분문자열을 비밀번호로 사용하려고 한다.
이 때, 부분 문자열에 포함되는 문자의 개수가 지정한 경우를 넘어야 한다.
e.g. A 1개 이상, C 1개 이상, G 1개 이상, T 0개 이상
부분문자열이 등장하는 위치가 다르다면, 다른 문자열로 취급한다.
입력 첫 줄은 DNA 문자열 길이와 부분문자열 길이가 주어지며,
두 번째 줄은 DNA 문자열이, 세번째 줄은 [A, C, G, T]의 최소 개수가 주어진다.
만들 수 있는 부분문자열 비밀번호의 종류 수를 출력하라.

입력
9 8
CCTGGATTG
2 0 1 1
출력
0

입력
4 2
GATA
1 0 0 1
출력
2
 */
public class Ch03P09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dnaSize = sc.nextInt();
        int pwdSize = sc.nextInt();
        String dna = sc.next();
        Map<Character, Integer> wordSize = new HashMap<>();
        wordSize.put('A', sc.nextInt());
        wordSize.put('C', sc.nextInt());
        wordSize.put('G', sc.nextInt());
        wordSize.put('T', sc.nextInt());

        System.out.println(solution(dnaSize, pwdSize, dna, wordSize));
    }

    private static long solution(int dnaSize, int pwdSize, String dna, Map<Character, Integer> wordSize) {
        long answer = 0;
        Map<Character, Integer> word = new HashMap<>();

        for (int i = 0; i < dnaSize; i++) {
            // 문자 추가
            word.put(dna.charAt(i), word.getOrDefault(dna.charAt(i), 0) + 1);

            if (i < pwdSize - 1) continue;

            // 부분문자열이 조건에 맞는지 확인
            if (wordSize.get('A') <= word.getOrDefault('A', 0) && wordSize.get('C') <= word.getOrDefault('C', 0)
                    && wordSize.get('G') <= word.getOrDefault('G', 0) && wordSize.get('T') <= word.getOrDefault('T', 0))
                answer++;

            // 현재 부분문자열 맨 앞 문자 제외하기
            word.put(dna.charAt(i - pwdSize + 1), word.getOrDefault(dna.charAt(i - pwdSize + 1), 0) - 1);
        }

        return answer;
    }
}
