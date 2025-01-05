package prev2025;

// 연습문제 > 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class 이상한_문자_만들기 {
    public String solution(String s) {
        String answer = "";

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(i, i + 1);

            if (sub.isBlank()) {
                answer += sub;
                cnt = 0;
                continue;
            }

            if (cnt % 2 == 0) {
                answer += sub.toUpperCase();
            } else {
                answer += sub.toLowerCase();
            }

            cnt++;
        }

        return answer;
    }
}
