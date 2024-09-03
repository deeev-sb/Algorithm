package codility;

// Lesson 3 > Time Complexity > TapeEquilibrium
// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
public class TapeEquilibrium {
    public int solution(int[] A) {
        // Implement your solution here
        int size = A.length;
        int[] sumA = new int[size];
        sumA[0] = A[0];

        for (int i = 1; i < size; i++) {
            sumA[i] = A[i] + sumA[i - 1];
        }

        int answer = Math.abs(sumA[size - 1] - 2 * sumA[0]);

        for (int i = 1; i < size - 1; i++) {
            answer = Math.min(answer, Math.abs(sumA[size - 1] - 2 * sumA[i]));
        }

        return answer;
    }
}