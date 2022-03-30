package medium;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Forming a Magic Square
 * 3x3의 서로 다른 양의 정수로 구성된 행렬
 * 행과 열, 대각선의 길이의 합은 같은 숫자가 되는 최소 score 구하기
 * 여기서 score 는 |a-b|
 */
public class FormingMagicSquare {
    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] magicSquares = {
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}}
        };

        int[][] magicSquare;
        int score;
        int answer = 100;
        int magicSquareValue;
        int squareValue;
        for (int idx = 0; idx < 8; idx++) {
            magicSquare = magicSquares[idx];
            score = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    magicSquareValue = magicSquare[i][j];
                    squareValue = s.get(i).get(j);
                    if (magicSquareValue != squareValue) {
                        score += Math.abs(magicSquareValue - squareValue);
                    }
                }
            }
            answer = Math.min(answer, score);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
