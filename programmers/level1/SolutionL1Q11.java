// 가운데 글자 가져오기

class SolutionL1Q11 {
    public String solution(String s) {
        String answer = "";
        int n = s.length();
        if (n % 2 == 0){
            answer += s.charAt(n/2-1);
            answer += s.charAt(n/2);
        }
        else
            answer += s.charAt(n/2);
        return answer;
    }
}