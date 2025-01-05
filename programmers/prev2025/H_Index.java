package prev2025;

import java.util.Arrays;

// 정렬 > H-Index
// https://school.programmers.co.kr/learn/courses/30/lessons/42747
public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);
        int size = citations.length;

        // 인용된 횟수
        for (int i = 0; i <= size; i++) {
            if (i < size && citations[i] == 0) continue;

            // 인용된 논문 수
            for (int j = 0; j < size; j++) {
                if (i <= citations[j] && i <= size - j) {
                    answer = i;
                    break;
                }
            }
        }


        return answer;
    }
}
