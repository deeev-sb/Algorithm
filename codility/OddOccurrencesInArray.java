package codility;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Lesson 2 > Arrays > OddOccurrencesInArray
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // Implement your solution here
        int answer = 0;
        Map<Integer, Integer> pair = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            int pairCount = pair.getOrDefault(A[i], 0);
            pair.put(A[i], pairCount + 1);
        }

        Set<Integer> pairNum = pair.keySet();

        for (int num : pairNum) {
            if (pair.get(num) % 2 != 0) {
                answer = num;
                break;
            }
        }

        return answer;
    }
}
