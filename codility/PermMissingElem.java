package codility;

// Lesson 3 > Time Complexity > PermMissingElem
// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
public class PermMissingElem {
    public int solution(int[] A) {
        int answer = 0;
        int sizeA = A.length;
        boolean[] isNum = new boolean[sizeA + 2];

        for (int i = 0; i < sizeA; i++) {
            isNum[A[i]] = true;
        }


        for (int i = 1; i < sizeA + 2; i++) {
            if (!isNum[i]) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}