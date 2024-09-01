package codility;

// Lesson 2 > Arrays > CyclicRotation
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int sizeA = A.length;
        int[] answer = new int[sizeA];

        for (int i = 0; i < sizeA; i++) {
            int num = A[i];
            int index = i + K;

            if (index < sizeA) {
                answer[index] = num;
            } else {
                answer[index % sizeA] = num;
            }
        }

        return answer;
    }
}
