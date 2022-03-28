package twopointers_slidingwindow;

import java.util.Scanner;

/* 두 배열 합치기
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램
첫 번재 배열 크기 n, n개의 배열 원소, 두 번째 배열 크기 m, m개의 배열 원소 순으로 입력
3              -> 1 2 3 3 5 6 7 9
1 3 5
5
2 3 6 7 9
정렬이 되어 있으므로 앞에서부터 비교하면서 둘 중 하나라도 끝날 때까지 진행
 */
public class TwoPointSlidingWindow01 {

    /**
     * 남아있는 숫자 추가
     *
     * @param idx    배열 현재 인덱스
     * @param len    배열 길이
     * @param array  배열
     * @param answer 정답
     * @return 완성된 정답 반환
     */
    public static String addRemainingNumbers(int idx, int len, int[] array, StringBuilder answer) {
        // 공백이 포함되지 않도록 마지막 인덱스 값은 반복문에 포함하지 않음
        for (int i = idx; i < len - 1; i++) {
            answer.append(array[i]).append(" ");
        }
        answer.append(array[len - 1]);
        return answer.toString();
    }

    /**
     * 문제 풀이
     *
     * @param firstArrayLen  첫 번째 배열 길이
     * @param firstArray     첫 번째 배열
     * @param secondArrayLen 두 번째 배열 길이
     * @param secondArray    두 번째 배열
     * @return answer
     */
    public static String solution(int firstArrayLen, int[] firstArray, int secondArrayLen, int[] secondArray) {
        int firstArrayIdx = 0;
        int secondArrayIdx = 0;
        StringBuilder answer = new StringBuilder();

        while (firstArrayIdx < firstArrayLen && secondArrayIdx < secondArrayLen) {
            if (firstArray[firstArrayIdx] < secondArray[secondArrayIdx]) {
                answer.append(firstArray[firstArrayIdx]).append(" ");
                firstArrayIdx++;
            } else {
                answer.append(secondArray[secondArrayIdx]).append(" ");
                secondArrayIdx++;
            }
        }

        if (firstArrayIdx < firstArrayLen) {
            return addRemainingNumbers(firstArrayIdx, firstArrayLen, firstArray, answer);
        } else {
            return addRemainingNumbers(secondArrayIdx, secondArrayLen, secondArray, answer);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstArrayLen = input.nextInt();
        int[] firstArray = new int[firstArrayLen];
        for (int idx = 0; idx < firstArrayLen; idx++) {
            firstArray[idx] = input.nextInt();
        }

        int secondArrayLen = input.nextInt();
        int[] secondArray = new int[secondArrayLen];
        for (int idx = 0; idx < secondArrayLen; idx++) {
            secondArray[idx] = input.nextInt();
        }

        System.out.println(solution(firstArrayLen, firstArray, secondArrayLen, secondArray));
    }
}
