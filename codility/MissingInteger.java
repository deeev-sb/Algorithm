package codility;

import java.util.Arrays;

// Lesson 4 > Counting Elements > MissingInteger
// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {
    public int solution(int[] A) {
        int answer = 1;

        Arrays.sort(A);

        for (int num : A) {
            if (num == answer) answer++;
        }

        return answer;
    }
}