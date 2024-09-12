package codility;

// Lesson 4 > Counting Elements > MaxCounters
// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        int maxNum = 0;
        int maxCounter = 0;

        for (int num : A) {
            if (num == N + 1) {
                maxCounter = maxNum;
            } else {
                int index = num - 1;
                answer[index] = answer[index] < maxCounter ? maxCounter + 1 : answer[index] + 1;
                maxNum = Math.max(maxNum, answer[index]);
            }
        }

        for (int i = 0; i < N; i++) {
            if (answer[i] < maxCounter) answer[i] = maxCounter;
        }

        return answer;
    }
}