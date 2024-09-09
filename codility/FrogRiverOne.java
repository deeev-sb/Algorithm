package codility;

import java.util.Arrays;

// Lesson 4 > Counting Elements > FrogRiverOne
// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
public class FrogRiverOne {
    public int solution(int[] A) { // 1 ~ N까지 순서대로 담고 있어야 함
        Arrays.sort(A);

        if (A[0] != 1) return 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] != 1) return 0;
        }

        return 1; // 순열
    }
}