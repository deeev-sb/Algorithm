package sotring_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 뮤직비디오(결정알고리즘)
 *
 */
public class SortingSearching09 {
    public static int solution(int musicNums, int dvdNums, int[] musicInfos) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int musicNums = input.nextInt();
        int dvdNums = input.nextInt();
        int[] musicInfos = new int[musicNums];

        for (int idx = 0; idx < musicNums; idx++) {
            musicInfos[idx] = input.nextInt();
        }

        System.out.println(solution(musicNums, dvdNums, musicInfos));

    }
}
