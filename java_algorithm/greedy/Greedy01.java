package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 씨름선수
 * N명의 지원자를 비교하는 방법은 다음과 같다.
 * 비교하려는 지원자가 A라면, A 지원자와 다른 지원자의 모든 키와 몸무게를 비교한다.
 * 만약 A 지원자보다 키와 몸무게가 모두 큰 지원자가 존재한다면 A 지원자는 탈락한다.
 * 5        ->  3
 * 172 67
 * 183 65
 * 180 70
 * 170 72
 * 181 60
 * 키를 기준으로 내림차순 정렬하고, 몸무게의 최고점을 기록해둔다.
 * 키가 가장 큰 사람은 무조건 선발되며, 두 번째부터는 앞에 있는 사람들보다 몸무게가 더 많이 나가야 한다.
 */
public class Greedy01 {
    public static int solution(int applicantsNum, int[][] applicantInfos) {
        int numberOfPeopleSelected = 0; // 선택된 사람 수
        Arrays.sort(applicantInfos, (o1, o2) -> o2[0] - o1[0]); // 키 순서로 내림차순 정렬

        int maxWeight = 0;
        for (int idx = 0; idx < applicantsNum; idx++) {
            if (applicantInfos[idx][1] > maxWeight) { // 최대 몸무게보다 몸무게가 큰 경우
                maxWeight = applicantInfos[idx][1];
                numberOfPeopleSelected++;
            }
        }
        return numberOfPeopleSelected;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int applicantsNum = input.nextInt(); // 지원자 수
        int[][] applicantInfos = new int[applicantsNum][2]; // 지원자 정보

        for (int idx = 0; idx < applicantsNum; idx++) {
            applicantInfos[idx][0] = input.nextInt(); // 지원자 키
            applicantInfos[idx][1] = input.nextInt(); // 지원자 몸무게
        }

        System.out.println(solution(applicantsNum, applicantInfos));
    }
}

/*
//이차원 배열 정렬하는 방법
int[][] arrays = {{0,3},{1,2},{1,4}};
// Comparator
Arrays.sort(arrays, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        if (o1[0] == o2[0])
            return o1[1] - o2[1];
        else
            return o1[0] - o2[0];
    }
});
// 람다식
Arrays.sort(arrays, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
// 내림차순
Arrays.sort(arrays, ((o1, o2) -> o2[0] == o1[0] ? o2[1] - o1[1] : o2[0] - o1[0]));
// 하나의 인덱스 기준으로 정렬
Arrays.sort(arrays, (o1, o2) -> o1[1] - o2[1]);

// 만약 string 이라면
String[][] strings = {{"0", "2"}, {"0", "3"}, {"1", "2"}};
Arrays.sort(strings, (o1, o2) -> o1[0].equals(o2[0]) ? o1[1].compareTo(o2[1]) : o1[0].compareTo(o2[0]));
 */