// 짝수와 홀수

class SolutionL1Q05 {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";
        return answer;
    }
}