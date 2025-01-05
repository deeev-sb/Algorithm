package prev2025;

// 탐욕법(Greedy) > prev2025.체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] sportswear = new int[n + 2];

        for (int l : lost) {
            sportswear[l]--;
        }

        for (int r : reserve) {
            sportswear[r]++;
        }

        int answer = 0;

        for (int i = 1; i < n + 1; i++) {
            if (sportswear[i] == -1 && sportswear[i + 1] == 1 || sportswear[i] == 1 && sportswear[i + 1] == -1) {
                sportswear[i] = 0;
                sportswear[i + 1] = 0;
                answer++;
            } else if (sportswear[i] == -1 && sportswear[i - 1] == 1 || sportswear[i] == 1 && sportswear[i - 1] == -1) {
                sportswear[i] = 0;
                sportswear[i - 1] = 0;
                answer++;
            } else if (sportswear[i] >= 0) {
                answer++;
            }
        }

        return answer;
    }
}
