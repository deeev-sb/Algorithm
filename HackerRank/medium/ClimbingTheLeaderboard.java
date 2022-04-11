package medium;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * Climbing The Leaderboard
 * 현재 랭킹에 대한 Leaderboard 가 존재할 때, 플레이어의 점수가 위치할 순위를 구하라.
 * 순위는 Dense Ranking을 사용한다. (1, 2, 2, 3 과 같이 동일 순위면 공동 2등, 그 다음은 3등)
 * 7                        -> 6
 * 100 100 50 40 40 20 10      4
 * 4                           2
 * 5 25 50 120                 1
 * 여기서 플레이어는 모두 동일 인물로 플레이어가 해당 점수를 받았을 때의 순위를 구하는 것이다.
 */
public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> rankedSet = new HashSet<>(ranked);
        List<Integer> rankedList = new ArrayList<>(rankedSet);
        rankedList.sort(Collections.reverseOrder());
        List<Integer> playerRankedList = new ArrayList<>();
        int rankedLen = rankedList.size();
        int rank = 0;
        int startIdx;
        int mIdx;
        int endIdx;
        int rankedValue;

        for (int score : player) {
            startIdx = 0;
            mIdx = rankedLen / 2;
            endIdx = rankedLen - 1;


            if (score > rankedList.get(0)) {
                playerRankedList.add(1);
                continue;
            }

            if (score < rankedList.get(endIdx)) {
                playerRankedList.add(rankedLen + 1);
                continue;
            }

            while (startIdx <= endIdx) {
                rankedValue = rankedList.get(mIdx);

                if (startIdx == endIdx) {
                    if (score > rankedValue) {
                        rank = startIdx + 1;
                    } else if (score < rankedValue) {
                        rank = startIdx + 2;
                    } else {
                        rank = startIdx + 1;
                    }
                    break;
                }

                if (score < rankedValue) {
                    startIdx = mIdx + 1;
                    mIdx = (startIdx + endIdx) / 2;
                } else if (score > rankedValue) {
                    endIdx = mIdx;
                    mIdx = (startIdx + endIdx) / 2;
                } else {
                    rank = rankedList.indexOf(rankedValue) + 1;
                    break;
                }
            }

            playerRankedList.add(rank);

        }


        return playerRankedList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
