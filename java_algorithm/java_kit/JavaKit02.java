package java_kit;

import java.util.Arrays;

/**
 * 가장 큰 수
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여서 만들 수 있는 가장 큰 수 구하기
 * 예를 들어, 6, 10, 2 라면 만들 수 있는 가장 큰 수는 6, 2, 10
 * numbers 의 길이는 1이상 100,000 이하
 * numbers 의 원소는 0 이상 1,000 이하
 * =====
 * [6, 10, 2]	      -> "6210"
 * [3, 30, 34, 5, 9]  -> "9534330"
 * =====
 * 순열을 이용해서 풀면 시간 초과
 * 숫자를 문자로 바꾼 다음 내림차순 정렬하여 조합하면 가장 큰 수를 얻을 수 있음
 */
public class JavaKit02 {
    public static String solution(int[] numbers) {
        String answer = "";
        int numbersLen = numbers.length;
        String[] strNumbers = new String[numbersLen];

        for (int idx = 0; idx < numbersLen; idx++) {
            strNumbers[idx] = String.valueOf(numbers[idx]);
        }

        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        for (int idx = 0; idx < numbersLen; idx++) {
            answer += strNumbers[idx];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] numbers = {{6, 10, 2}, {3, 30, 34, 5, 9}, {0, 0}};
        for (int idx = 0; idx < 3; idx++) {
            System.out.println(solution(numbers[idx]));
        }
    }
}

/*

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numbers) {
        // Stream 활용하기
        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) return "0";
        return answer;
    }
}

 */