package cos;

// [1차] 체스의 나이트
class COS1G1P06 {
    public int solution(String pos) {
        int[] dr = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dc = {-1, 1, 2, 2, 1, -1, -2, -2};
        int answer = 0;
        int curR = Integer.valueOf(pos.toCharArray()[0] - 'A');
        int curC = 8 - Integer.valueOf(pos.toCharArray()[1] - '0');
        int nr, nc;
        for (int i = 0; i < 8; i++) {
            nr = curR + dr[i];
            nc = curC + dc[i];
            if (0 <= nr && nr < 8 && 0 <= nc && nc < 8) answer += 1;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS1G1P06 sol = new COS1G1P06();
        String pos = "A7";
        int ret = sol.solution(pos);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}