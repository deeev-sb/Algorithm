package prev2025.level1;// 약수의 합

class SolutionL1Q04 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                answer += i;
        }
        return answer;
    }
}