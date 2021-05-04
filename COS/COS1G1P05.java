package COS;

// [1차] 소용돌이 수
class COS1G1P05 {
    public int solution(int n) {
        int answer = 1;
        int jump = n * 2 - 2;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            temp += jump;
            answer += temp;
            if (i % 2 == 0) jump /= 2;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G1P05 sol = new COS1G1P05();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}