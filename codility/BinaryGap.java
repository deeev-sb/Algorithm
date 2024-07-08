package codility;

// Lesson 1 Iterations > BinaryGap
// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
public class BinaryGap {
    public int solution(int N) {
        int answer = 0;

        boolean start = false;
        int count = 0;

        while(N > 0) {
            int temp = N % 2;

            if (temp == 1) {
                if (start) {
                    answer = Math.max(answer, count);
                    count = 0;
                } else {
                    start = true;
                }
            } else {
                if (start) {
                    count++;
                }
            }

            N /= 2;
        }

        return answer;
    }
}
