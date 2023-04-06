// x만큼 간격이 있는 n개의 숫자

class SolutionL1Q18 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = 0;
        for (int i = 0; i < n; i++){
            temp += x;
            answer[i] = temp;
        }
        return answer;
    }
}