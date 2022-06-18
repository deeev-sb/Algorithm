package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 좌표 정렬
 * N개의 평면상의 좌표 (x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하라
 * 정렬 기준은 먼저 x 값에 의해서 정렬하고, x 값이 같을 경우 y 값에 의해 정렬하라
 * 입력
 * 5
 * 2 7
 * 1 3
 * 1 2
 * 2 5
 * 3 6
 * 출력
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */
public class SortingSearching07 {
    public static int[][] solution(int[][] coordinates) {

        Arrays.sort(coordinates, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);

        return coordinates;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coordinateNums = input.nextInt();
        int[][] coordinates = new int[coordinateNums][2];

        for (int idx = 0; idx < coordinateNums; idx++) {
            coordinates[idx][0] = input.nextInt();
            coordinates[idx][1] = input.nextInt();
        }

        int[][] sortingCoordinates = solution(coordinates);

        for (int idx = 0; idx < coordinateNums; idx++) {
            System.out.println(sortingCoordinates[idx][0] + " " + sortingCoordinates[idx][1]);
        }

    }
}
