package codility;

// Lesson 4 > Counting Elements > PermCheck
// https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
public class PermCheck {
    public int solution(int X, int[] A) {
        boolean[] position = new boolean[X + 1];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (position[A[i]]) continue;
            position[A[i]] = true;
            count++;

            if (count == X) return i;
        }

        return -1;
    }
}